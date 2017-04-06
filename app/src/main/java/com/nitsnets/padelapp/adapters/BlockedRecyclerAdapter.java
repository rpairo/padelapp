package com.nitsnets.padelapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.models.Player;
import com.nitsnets.padelapp.viewholders.BlockedViewHolder;

import java.util.List;

/**
 * Created by raul on 7/4/17.
 */

public class BlockedRecyclerAdapter extends RecyclerView.Adapter<BlockedViewHolder> {

    //regions Variables
    private List<Player> players;
    //endregion

    //region Constructors
    public BlockedRecyclerAdapter(List<Player> players) {
        this.players = players;
    }
    //endregions

    //region Adapter functions
    @Override
    public BlockedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_player_block, parent, false);
        return new BlockedViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BlockedViewHolder holder, int position) {

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
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
