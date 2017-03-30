package com.nitsnets.padelapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.adapters.RankingRecyclerAdapter;
import com.nitsnets.padelapp.models.Match;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by raul on 29/3/17.
 */

public class RankingFragment extends BaseFragment {

    //region Variables
    @BindView(R.id.recycler_ranking)
    RecyclerView recyclerView;

    private Unbinder unbinder;

    private RankingRecyclerAdapter rankingRecyclerAdapter;
    private List<Match> players;
    //endregion

    //region Lifecycle
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ranking, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.players = new ArrayList<>();

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

        rankingRecyclerAdapter = new RankingRecyclerAdapter(players);

        recyclerView.setAdapter(rankingRecyclerAdapter);
        recyclerView.refreshDrawableState();
    }
    //endregion
}
