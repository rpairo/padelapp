package com.nitsnets.padelapp.models;

import com.nitsnets.padelapp.enums.Weekday;

/**
 * Created by raul on 10/4/17.
 */

public class Day {

    //region Variables
    private Weekday weekday;
    private final boolean[] hours = new boolean[14];
    //endregion

    //region Constructors
    public Day() {
        this.weekday = null;
    }
    //endregion

    //region Getters and setters
    //region Getters
    public Weekday getWeekday() {
        return weekday;
    }

    public boolean[] getHours() {
        return hours;
    }
    //endregion

    //region Setters
    public void setWeekday(Weekday weekday) {
        this.weekday = weekday;
    }
    //endregion
    //endregion
}
