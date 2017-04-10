package com.nitsnets.padelapp.viewholders;

import android.os.CountDownTimer;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.nitsnets.padelapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by raul on 29/3/17.
 */

public class NowViewHolder extends RecyclerView.ViewHolder {

    //region Variables
    @BindView(R.id.time_match)
    public TextView timer;

    public CountDownTimer countDownTimer;
    //endregion

    //region Constructors
    public NowViewHolder(View view) {
        super(view);

        ButterKnife.bind(this, view);
    }
    //endregion
}
