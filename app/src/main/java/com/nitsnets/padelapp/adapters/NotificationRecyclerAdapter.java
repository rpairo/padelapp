package com.nitsnets.padelapp.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.models.Notification;
import com.nitsnets.padelapp.viewholders.NotificationViewHolder;

import java.util.List;

/**
 * Created by raul on 7/4/17.
 */

public class NotificationRecyclerAdapter extends RecyclerView.Adapter<NotificationViewHolder> {

    //regions Variables
    private List<Notification> notifications;
    //endregion

    //region Constructors
    public NotificationRecyclerAdapter(List<Notification> notifications) {
        this.notifications = notifications;
    }
    //endregions

    //region Adapter functions
    @Override
    public NotificationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_notification, parent, false);
        return new NotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(NotificationViewHolder holder, int position) {

    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return this.notifications.size();
    }
    //endregion

    //region Auxiliary functions
    public void addAll(List<Notification> notifications) {
        if (notifications == null)
            throw new NullPointerException();

        this.notifications.addAll(notifications);
        this.notifyDataSetChanged();
    }
    //endregion
}
