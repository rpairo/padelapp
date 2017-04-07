package com.nitsnets.padelapp.activities;

import android.view.View;

import com.nitsnets.padelapp.R;

import butterknife.OnClick;

/**
 * Created by raul on 7/4/17.
 */

public class EditNotificationsActivity extends BaseActivity {

    //region Base functions
    @Override
    public int getLayoutId() {
        return R.layout.activity_edit_notifications;
    }
    //endregion

    //region Call System
    @OnClick(R.id.icon_back_arrow)
    public void backToolbarArrow(View view) {
        onBackPressed();
    }
    //endregion
}
