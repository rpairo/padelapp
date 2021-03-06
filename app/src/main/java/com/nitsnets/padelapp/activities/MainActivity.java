package com.nitsnets.padelapp.activities;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.fragments.BaseFragment;
import com.nitsnets.padelapp.fragments.MatchesFragment;
import com.nitsnets.padelapp.fragments.MyMatchesFragment;
import com.nitsnets.padelapp.fragments.NowFragment;
import com.nitsnets.padelapp.fragments.ProfileFragment;
import com.nitsnets.padelapp.fragments.RankingFragment;
import com.nitsnets.padelapp.utils.BottomNavigationViewHelper;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by raul on 26/3/17.
 */

public class MainActivity extends BaseActivity {

    //region Variables
    @BindView(R.id.bottom_navigation_main)
    BottomNavigationView bottomNavigationView;

    private Fragment fragment;
    private FragmentManager fragmentManager;
    //endregion

    //region Lifecycle
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        configureFragments();

        configureBottomNativation();
    }
    //endregion

    //region Base functions
    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public int getTitleId() {
        return R.string.first_title_toolbar_main;
    }
    //endregion

    //region Fragments
    private void configureFragments() {
        fragmentManager = getSupportFragmentManager();
        fragment = new MatchesFragment();
        final FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.content, fragment).commit();
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

                switch (item.getItemId()) {
                    case R.id.navigation_matches:
                        fragment = new MatchesFragment();
                        break;
                    case R.id.navigation_now:
                        fragment = new NowFragment();
                        break;
                    case R.id.navigation_ranking:
                        fragment = new RankingFragment();
                        break;
                    case R.id.navigation_my_matches:
                        fragment = new MyMatchesFragment();
                        break;
                    case R.id.navigation_profile:
                        fragment = new ProfileFragment();
                        break;
                    default:
                        fragment = new BaseFragment();
                        break;
                }

                fragmentManager.beginTransaction().replace(R.id.content, fragment).commit();
                return true;
            }
        };

        return onNavigationItemSelectedListener;
    }
    //endregion

    //region Actions
    @OnClick(R.id.icon_notifications)
    public void callNotifications(View view) {
        startActivity(new Intent(this, NotificationsActivity.class));
    }
    //endregion
}
