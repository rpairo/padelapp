package com.nitsnets.padelapp.models;

/**
 * Created by raul on 10/4/17.
 */

public class Schedule {

    //region Variables
    private final Day[] days = new Day[7];
    //endregion

    //region Getters and setters
    //region Getters
    public Day[] getDays() {
        return days;
    }
    //endregion
    //endregion
}
