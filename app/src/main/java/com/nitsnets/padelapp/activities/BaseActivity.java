package com.nitsnets.padelapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.nitsnets.padelapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by raul on 27/3/17.
 */

public abstract class BaseActivity extends AppCompatActivity {

    //region Variables
    @BindView(R.id.title_toolbar)
    TextView titleToolbar;

    @BindView(R.id.toolbar_main)
    Toolbar toolbar;
    //endregion

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(getLayoutId());

        ButterKnife.bind(this);

        configureToolbar(getTitleId());
    }

    public abstract int getLayoutId();

    public abstract int getTitleId();

    //region Toolbar
    private void configureToolbar(int titleToolbar) {
        if (toolbar != null) setSupportActionBar(toolbar);

        this.titleToolbar.setText(getString(titleToolbar));
    }
    //endregion
}
