package com.nitsnets.padelapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.models.Player;
import com.nitsnets.padelapp.viewholders.RankingPlayerViewHolder;

import java.util.List;

/**
 * Created by raul on 29/3/17.
 */

public class RankingRecyclerAdapter extends RecyclerView.Adapter<RankingPlayerViewHolder> {

    //regions Variables
    private List<Player> players;
    //endregion

    //region Constructors
    public RankingRecyclerAdapter(List<Player> players) {
        this.players = players;
    }
    //endregions

    //region Adapter functions
    @Override
    public RankingPlayerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_player_ranking, parent, false);
        return new RankingPlayerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RankingPlayerViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return this.players.size();
    }
    //endregion

    //region Auxiliary functions
    public void addAll(List<Player> players) {
        if (players == null)
            throw new NullPointerException();

        this.players.addAll(players);
        this.notifyDataSetChanged();
    }
    //endregion
}
