package com.nitsnets.padelapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.models.Match;
import com.nitsnets.padelapp.viewholders.NowViewHolder;

import java.util.List;

/**
 * Created by raul on 29/3/17.
 */

public class NowRecyclerAdapter extends RecyclerView.Adapter<NowViewHolder> {

    //regions Variables
    private List<Match> matches;
    //endregion

    //region Constructors
    public NowRecyclerAdapter(List<Match> matches) {
        this.matches = matches;
    }
    //endregions

    //region Adapter functions
    @Override
    public NowViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_now, parent, false);
        return new NowViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NowViewHolder holder, int position) {

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
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
