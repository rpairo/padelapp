package com.nitsnets.padelapp.utils;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.Filterable;

import com.nitsnets.padelapp.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by raul on 5/4/17.
 */

public class CustomDialog extends DialogFragment implements AdapterView.OnItemClickListener {

    //region Variables
    private static final String PLACES_API_BASE = "https://maps.googleapis.com/maps/api/place";
    private static final String TYPE_AUTOCOMPLETE = "/autocomplete";
    private static final String OUT_JSON = "/json";
    private static final String API_KEY = "AIzaSyCSaBOWqfhpMpzTlSJ8LnCoVJ68QxWTz1s";

    private static final String LOG_TAG = "SET_LOCATION";

    private EventLocation eventLocation;
    private InputMethodManager imm;
    private Unbinder unbinder;

    @BindView(R.id.autocomplete_search_location)
    public AutoCompleteTextView autoCompView;

    @BindView(R.id.positive_button)
    public AppCompatButton positiveButton;

    @BindView(R.id.negative_button)
    public AppCompatButton negativeButton;
    //endregion

    //region Constructor
    public void initCustomDialog(EventLocation eventLocation) {
        this.eventLocation = eventLocation;
    }
    //endregion

    //region Lifecycle
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View mView = inflater.inflate(R.layout.layout_set_location, container, false);

        unbinder = ButterKnife.bind(this, mView);

        autoCompView.setAdapter(new GooglePlacesAutocompleteAdapter(getContext(), R.layout.layout_set_location_item_list));

        imm = (InputMethodManager) getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);

        return mView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        unbinder.unbind();
    }
    //endregion

    //region Actions
    @OnClick(R.id.positive_button)
    public void acceptLocation(View view) {

        eventLocation.onLocationAdded(autoCompView.getText().toString());

        if (imm.isActive()) imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        dismiss();
    }

    @OnClick(R.id.negative_button)
    public void cancelLocation(View view) {

        if (imm.isActive()) imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        dismiss();
    }

    @Override
    public void onItemClick(AdapterView adapterView, View view, int position, long id) {
        String str = (String) adapterView.getItemAtPosition(position);
    }
    //endregion

    //region functions
    public static ArrayList autocomplete(String input) {

        ArrayList resultList = null;
        HttpURLConnection conn = null;
        StringBuilder jsonResults = new StringBuilder();

        try {

            StringBuilder sb = new StringBuilder(PLACES_API_BASE + TYPE_AUTOCOMPLETE + OUT_JSON);
            sb.append("?key=" + API_KEY);
            sb.append("&components=country:es");
            sb.append("&types=(cities)");
            sb.append("&input=" + URLEncoder.encode(input, "utf8"));

            conn = (HttpURLConnection) new URL(sb.toString()).openConnection();
            InputStreamReader in = new InputStreamReader(conn.getInputStream());

            // Load the results into a StringBuilder
            int read;
            char[] buff = new char[1024];

            while ((read = in.read(buff)) != -1)
                jsonResults.append(buff, 0, read);

        } catch (MalformedURLException e) {
            Log.e(LOG_TAG, "Error processing Places API URL", e);
            return null;

        } catch (IOException e) {
            Log.e(LOG_TAG, "Error connecting to Places API", e);
            return null;
        } finally {
            if (conn != null) conn.disconnect();
        }

        try {

            // Create a JSON object hierarchy from the results
            JSONObject jsonObj = new JSONObject(jsonResults.toString());
            JSONArray predsJsonArray = jsonObj.getJSONArray("predictions");

            // Extract the Place descriptions from the results
            resultList = new ArrayList(predsJsonArray.length());

            for (int i = 0; i < predsJsonArray.length(); i++)
                resultList.add(predsJsonArray.getJSONObject(i).getString("description"));

        } catch (JSONException e) {
            Log.e(LOG_TAG, "Cannot process JSON results", e);
        }

        return resultList;
    }
    //endregion

    //region Private class autocomplete
    private class GooglePlacesAutocompleteAdapter extends ArrayAdapter implements Filterable {

        //region Variables
        private ArrayList<String> resultList;
        //endregion

        //region Constructor
        private GooglePlacesAutocompleteAdapter(Context context, int textViewResourceId) {
            super(context, textViewResourceId);
        }
        //endregion

        //region Adapter
        @Override
        public int getCount() {
            return resultList.size();
        }

        @Override
        public String getItem(int index) {
            return resultList.get(index);
        }
        //endregion

        //region Filtrable
        @Override
        public Filter getFilter() {

            return new Filter() {

                @Override
                protected FilterResults performFiltering(CharSequence constraint) {

                    FilterResults filterResults = new FilterResults();

                    if (constraint != null) {

                        // Retrieve the autocomplete results.
                        resultList = autocomplete(constraint.toString());

                        // Assign the data to the FilterResults
                        filterResults.values = resultList;
                        filterResults.count = resultList.size();
                    }

                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {

                    if (results != null && results.count > 0)
                        notifyDataSetChanged();
                    else
                        notifyDataSetInvalidated();
                }
            };
        }
        //endregion
    }
    //endregion
}
