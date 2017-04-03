package com.nitsnets.padelapp.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.adapters.MatchesRecyclerAdapter;
import com.nitsnets.padelapp.models.Match;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by raul on 27/3/17.
 */

public class MatchesFragment extends BaseFragment {

    //region Variables
    @BindView(R.id.recycler_matches)
    RecyclerView recyclerView;

    private Unbinder unbinder;

    private MatchesRecyclerAdapter matchesRecyclerAdapter;
    private List<Match> matches;
    //endregion

    //region Lifecycle
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_matches, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        this.matches = new ArrayList<>();

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

        matchesRecyclerAdapter = new MatchesRecyclerAdapter(matches);

        recyclerView.setAdapter(matchesRecyclerAdapter);
        recyclerView.refreshDrawableState();
    }
    //endregion
}
