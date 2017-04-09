package com.nitsnets.padelapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.nitsnets.padelapp.R;

import butterknife.BindView;
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

    @Override
    public int getTitleId() {
        return R.string.title_toolbar_edit_notifications;
    }
    //endregion

    //region Call System
    @OnClick(R.id.icon_back_arrow)
    public void backToolbarArrow(View view) {
        onBackPressed();
    }
    //endregion
}
