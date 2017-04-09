package com.nitsnets.padelapp.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.adapters.NotificationRecyclerAdapter;
import com.nitsnets.padelapp.models.Notification;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by raul on 9/4/17.
 */

public class NotificationsActivity extends BaseActivity {

    //region Variables
    @BindView(R.id.recycler_notifications)
    RecyclerView recyclerView;

    private NotificationRecyclerAdapter notificationRecyclerAdapter;
    private List<Notification> notifications;
    //endregion


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.notifications = new ArrayList<>();

        configureRecycler();
    }

    //region Base functions
    @Override
    public int getLayoutId() {
        return R.layout.activity_notifications;
    }

    @Override
    public int getTitleId() {
        return R.string.title_toolbar_edit_notifications;
    }
    //endregion

    //region RecyclerView
    protected void configureRecycler() {

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        notificationRecyclerAdapter = new NotificationRecyclerAdapter(notifications);

        recyclerView.setAdapter(notificationRecyclerAdapter);
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
