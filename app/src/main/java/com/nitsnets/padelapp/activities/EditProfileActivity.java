package com.nitsnets.padelapp.activities;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import com.nitsnets.padelapp.R;
import com.nitsnets.padelapp.utils.CustomDialog;
import com.nitsnets.padelapp.utils.EventLocation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * Created by raul on 4/4/17.
 */

public class EditProfileActivity extends BaseActivity {

    //region Variables
    @BindView(R.id.birthdate_user)
    public TextView textViewBirthday;

    @BindView(R.id.location_user)
    public TextView locationUser;

    private Calendar birthday;
    //endregion

    //region Base functions
    @Override
    public int getLayoutId() {
        return R.layout.activity_edit_profile;
    }

    @Override
    public int getTitleId() {
        return R.string.title_toolbar_edit_profile;
    }
    //endregion

    //region Actions
    @OnClick(R.id.birthdate_user)
    public void callDatePicker(View view) {

        DatePickerDialog datePickerDialog;

        Calendar newCalendar = Calendar.getInstance();

        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                birthday = Calendar.getInstance();
                birthday.set(year, monthOfYear, dayOfMonth);

                SimpleDateFormat format = new SimpleDateFormat(getString(R.string.format_date_birthday), new Locale(getString(R.string.locale_format_date_birthday)));
                textViewBirthday.setText(format.format(birthday.getTime()));

            }

        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    @OnClick(R.id.location_user)
    public void callLocationPicker(View view) {

        CustomDialog custom = new CustomDialog();
        custom.initCustomDialog(new EventLocation() {

            @Override
            public void onLocationAdded(String location) {
                if (location.length() > 0) locationUser.setText(location);
            }

        });

        custom.show(getSupportFragmentManager(), getString(R.string.tag_dialog_fragment_location));
    }
    //endregion

    //region Call System
    @OnClick(R.id.icon_back_arrow)
    public void backToolbarArrow(View view) {
        onBackPressed();
    }
    //endregion
}
