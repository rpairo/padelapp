package com.nitsnets.padelapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.models.Match;
import com.nitsnets.padelapp.models.Result;
import com.nitsnets.padelapp.viewholders.MyMatchesViewHolder;
import com.nitsnets.padelapp.viewholders.MyMatchesTitleResultsViewHolder;

import java.util.List;

/**
 * Created by raul on 27/3/17.
 */

public class MyMatchesRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    //regions Variables
    private List<Object> matches;
    private final int MATCH = 0, TITLE = 1, RESULT = 2;
    //endregion

    //region Constructors
    public MyMatchesRecyclerAdapter(List<Object> matches) {
        this.matches = matches;
    }
    //endregions

    //region Adapter functions
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        RecyclerView.ViewHolder viewHolder;

        switch (viewType) {
            case MATCH:
                viewHolder = new MyMatchesViewHolder(inflater.inflate(R.layout.layout_my_matches, parent, false));
                break;
            case TITLE:
                viewHolder = new MyMatchesTitleResultsViewHolder(inflater.inflate(R.layout.layout_my_matches_title_results, parent, false));
                break;
            case RESULT:
                viewHolder = new MyMatchesTitleResultsViewHolder(inflater.inflate(R.layout.layout_result, parent, false));
                break;
            default:
                viewHolder = null;
                break;
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemViewType(int position) {

        if (matches.get(position) instanceof Match)
            return MATCH;

        else if (matches.get(position) instanceof String)
            return TITLE;

        else if (matches.get(position) instanceof Result)
            return RESULT;

        return -1;
    }

    @Override
    public int getItemCount() {
        return this.matches.size();
    }
    //endregion

    //region Auxiliary functions
    public void addAll(List<Match> matches) {
        if (matches == null)
            throw new NullPointerException();

        this.matches.addAll(matches);
        this.notifyDataSetChanged();
    }
    //endregion
}
