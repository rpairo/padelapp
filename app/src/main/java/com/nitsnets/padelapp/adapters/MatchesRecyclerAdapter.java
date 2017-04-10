package com.nitsnets.padelapp.adapters;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.activities.MatchDetailsActivity;
import com.nitsnets.padelapp.models.Match;
import com.nitsnets.padelapp.viewholders.MatchesViewHolder;

import java.util.List;

/**
 * Created by raul on 27/3/17.
 */

public class MatchesRecyclerAdapter extends RecyclerView.Adapter<MatchesViewHolder> {

    //regions Variables
    private List<Match> matches;
    //endregion

    //region Constructors
    public MatchesRecyclerAdapter(List<Match> matches) {
        this.matches = matches;
    }
    //endregions

    //region Adapter functions
    @Override
    public MatchesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_match, parent, false);
        return new MatchesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MatchesViewHolder holder, int position) {

        holder.cardView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), MatchDetailsActivity.class));
            }
        });
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
