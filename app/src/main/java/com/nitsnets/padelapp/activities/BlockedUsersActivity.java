package com.nitsnets.padelapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.adapters.BlockedRecyclerAdapter;
import com.nitsnets.padelapp.models.Player;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by raul on 7/4/17.
 */

public class BlockedUsersActivity extends BaseActivity {

    //region Variables
    @BindView(R.id.recycler_blocked_players)
    RecyclerView recyclerView;

    private BlockedRecyclerAdapter blockedRecyclerAdapter;
    private List<Player> players;
    //endregion

    //region Lifecycle
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.players = new ArrayList<>();

        configureRecycler();
    }
    //endregion

    //region Base functions
    @Override
    public int getLayoutId() {
        return R.layout.activity_blocked_users;
    }

    @Override
    public int getTitleId() {
        return R.string.toolbar_title_blocked_players;
    }
    //endregion

    //region RecyclerView
    protected void configureRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        blockedRecyclerAdapter = new BlockedRecyclerAdapter(players);

        recyclerView.setAdapter(blockedRecyclerAdapter);
        recyclerView.refreshDrawableState();
    }
    //endregion

    //region Call System
    @OnClick(R.id.icon_back_arrow)
    public void backToolbarArrow(View view) {
        onBackPressed();
    }
    //endregion
}
