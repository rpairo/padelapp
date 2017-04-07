package com.nitsnets.padelapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by raul on 7/4/17.
 */

public class ScreenSplashActivity extends AppCompatActivity {

    //region Lifecycle
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }
    }
    //endregion
}
