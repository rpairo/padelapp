package com.nitsnets.padelapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.adapters.MyMatchesRecyclerAdapter;
import com.nitsnets.padelapp.models.Match;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by raul on 30/3/17.
 */

public class MyMatchesFragment extends BaseFragment {

    //region Variables
    @BindView(R.id.recycler_my_matches)
    RecyclerView recyclerView;

    private Unbinder unbinder;

    private MyMatchesRecyclerAdapter myMatchesRecyclerAdapter;
    private List<Object> matches;
    //endregion

    //region Lifecycle
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_matches, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.matches = new ArrayList<>();

        initMyMatchesList();

        configureRecycler(view);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        unbinder.unbind();
    }
    //endregion

    //region RecyclerView
    protected void configureRecycler(View view) {

        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        myMatchesRecyclerAdapter = new MyMatchesRecyclerAdapter(matches);

        recyclerView.setAdapter(myMatchesRecyclerAdapter);
        recyclerView.refreshDrawableState();
    }
    //endregion

    private void initMyMatchesList() {
        this.matches = new ArrayList<>();
    }
}
