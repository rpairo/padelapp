package com.nitsnets.padelapp.models;

/**
 * Created by raul on 27/3/17.
 */

public class Match {

    //region Variables
    private String timeStart;
    //endregion

    //region Constructors
    public Match() {
        this.timeStart = null;
    }

    public Match(String timeStart) {
        this.timeStart = timeStart;
    }
    //endregion

    //region Getter and setters
    public String getTimeStart() {
        return timeStart;
    }
    //endregion
}
