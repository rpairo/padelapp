package com.nitsnets.padelapp.viewholders;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.nitsnets.padelapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by raul on 27/3/17.
 */

public class MatchesViewHolder extends RecyclerView.ViewHolder {

    //region Variables
    @BindView(R.id.card_view_match)
    public CardView cardView;
    //endregion

    //region Constructors
    public MatchesViewHolder(View view) {
        super(view);

        ButterKnife.bind(this, view);
    }
    //endregion
}
