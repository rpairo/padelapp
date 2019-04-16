package com.nitsnets.padelapp.activities;

import android.view.View;

import com.nitsnets.padelapp.R;

import butterknife.OnClick;

/**
 * Created by raul on 10/4/17.
 */

public class MatchDetailsActivity extends BaseActivity {

    //region Base functions
    @Override
    public int getLayoutId() {
        return R.layout.layout_match_details;
    }

    @Override
    public int getTitleId() {
        return R.string.title_match_details;
    }
    //endregion

    //region Call System
    @OnClick(R.id.icon_back_arrow)
    public void backToolbarArrow(View view) {
        onBackPressed();
    }
    //endregion
}
