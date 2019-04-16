package com.nitsnets.padelapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.paolorotolo.appintro.AppIntro;
import com.nitsnets.padelapp.R;

/**
 * Created by raul on 7/4/17.
 */

public class TutorialActivity extends AppIntro {

    //region Lifecycle
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addSlide(new TutorialOne());
        addSlide(new TutorialTwo());
        addSlide(new TutorialThree());

        setSeparatorColor(0);
        showSkipButton(false);

        setDoneText(getString(R.string.button_done_tutorial));
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);

        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
    //endregion

    //region Sliders
    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }
    //endregion

    //region Tutorials
    public static class TutorialOne extends Fragment {

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.layout_tutorial_one, container, false);
        }
    }

    public static class TutorialTwo extends Fragment {

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.layout_tutorial_two, container, false);
        }
    }

    public static class TutorialThree extends Fragment {

        @Override
        public void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
        }

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.layout_tutorial_three, container, false);
        }
    }
    //endregion
}
