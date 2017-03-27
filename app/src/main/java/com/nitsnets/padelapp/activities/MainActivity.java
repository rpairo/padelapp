package com.nitsnets.padelapp.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.utils.BottomNavigationViewHelper;

import butterknife.BindView;

/**
 * Created by raul on 26/3/17.
 */

public class MainActivity extends BaseActivity {

    //region Variables
    @BindView(R.id.toolbar_main)
    Toolbar toolbar;

    @BindView(R.id.bottom_navigation_main)
    BottomNavigationView bottomNavigationView;
    //endregion

    //region Base functions
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }
    //endregion

    //region Lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        configureToolbar();

        configureBottomNativation();
    }
    //endregion

    //region Toolbar
    private void configureToolbar() {
        if (toolbar != null) setSupportActionBar(toolbar);
    }
    //endregion

    //region Bottom Navigation
    private void configureBottomNativation() {
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(configurarBottomNavigationSelectedListener());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener configurarBottomNavigationSelectedListener() {

        final BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        };

        return onNavigationItemSelectedListener;
    }
    //endregion
}
