package com.nitsnets.padelapp.activities;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.utils.BottomNavigationViewHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar_main)
    Toolbar toolbar;

    @BindView(R.id.bottom_navigation_main)
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        configureToolbar();

        configureBottomNativation();
    }

    private void configureToolbar() {
        if (toolbar != null) setSupportActionBar(toolbar);
    }

    private void configureBottomNativation() {
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(configurarBottomNavigationSelectedListener());
    }

    private BottomNavigationView.OnNavigationItemSelectedListener configurarBottomNavigationSelectedListener() {

        BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return true;
            }
        };

        return onNavigationItemSelectedListener;
    }
}
