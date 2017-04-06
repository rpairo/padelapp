package com.nitsnets.padelapp.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.activities.EditProfileActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by raul on 27/3/17.
 */

public class ProfileFragment extends BaseFragment {

    //region Variables
    private Unbinder unbinder;

    @BindView(R.id.edit_profile_button_profile)
    public TextView textViewEditProfile;
    //endregion

    //region Lifecycle
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        unbinder = ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        unbinder.unbind();
    }
    //endregion

    //region Actions
    @OnClick(R.id.edit_profile_button_profile)
    public void callEditProfileActivity(View view) {
        startActivity(new Intent(getActivity(), EditProfileActivity.class));
    }
    //endregion
}
