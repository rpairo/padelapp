package com.nitsnets.padelapp.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by raul on 7/4/17.
 */

public class BlockedViewHolder extends RecyclerView.ViewHolder {

    //region Constructors
    public BlockedViewHolder(View view) {
        super(view);

        ButterKnife.bind(this, view);
    }
    //endregion
}
