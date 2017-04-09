package com.nitsnets.padelapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.utils.CustomDialog;
import com.nitsnets.padelapp.utils.EventLocation;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by raul on 6/4/17.
 */

public class PreferencesPlayingActivity extends BaseActivity {

    //region Variables
    @BindView(R.id.location_user)
    public TextView locationUser;
    //endregion

    //region Base functions
    @Override
    public int getLayoutId() {
        return R.layout.activity_preferences_for_playing;
    }

    @Override
    public int getTitleId() {
        return R.string.title_toolbar_preferences_for_playing;
    }
    //endregion

    //region Actions
    @OnClick(R.id.location_user)
    public void callLocationPicker(View view) {

        CustomDialog custom = new CustomDialog();
        custom.initCustomDialog(new EventLocation() {

            @Override
            public void onLocationAdded(String location) {
                if (location.length() > 0) locationUser.setText(location);
            }

        });

        custom.show(getSupportFragmentManager(), getString(R.string.tag_dialog_fragment_location));
    }
    //endregion

    //region Call System
    @OnClick(R.id.icon_back_arrow)
    public void backToolbarArrow(View view) {
        onBackPressed();
    }
    //endregion
}
