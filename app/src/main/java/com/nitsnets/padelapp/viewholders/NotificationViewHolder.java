package com.nitsnets.padelapp.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;

/**
 * Created by raul on 29/3/17.
 */

public class NotificationViewHolder extends RecyclerView.ViewHolder {

    //region Constructors
    public NotificationViewHolder(View view) {
        super(view);

        ButterKnife.bind(this, view);
    }
    //endregion
}
