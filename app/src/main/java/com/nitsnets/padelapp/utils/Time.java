package com.nitsnets.padelapp.utils;

import java.util.concurrent.TimeUnit;

/**
 * Created by raul on 10/4/17.
 */

public class Time {

    //region Variables
    // Equivalence of one second in milliseconds
    public final static int REFRESH_COUNTDOWN = 250;
    //endregion

    //region Converters
    // Converter of milliseconds to format of the match cards
    public static String convertMilliToTime(long time) {
        return String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(time),
                TimeUnit.MILLISECONDS.toMinutes(time) % TimeUnit.HOURS.toMinutes(1),
                TimeUnit.MILLISECONDS.toSeconds(time) % TimeUnit.MINUTES.toSeconds(1));
    }
    //endregion
}
