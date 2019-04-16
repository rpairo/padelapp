package com.nitsnets.padelapp.models;

/**
 * Created by raul on 10/4/17.
 */

public class Availability {

    //region Variables
    private String location;
    private String distance;
    private Schedule schedule;
    //endregion

    //region Constructors
    public Availability() {
        this.location = null;
        this.distance = null;
        this.schedule = null;
    }
    //endregion

    //region Getters and setters
    //region Getters
    public String getLocation() {
        return location;
    }

    public String getDistance() {
        return distance;
    }

    public Schedule getSchedule() {
        return schedule;
    }
    //endregion

    //region Setters
    public void setLocation(String location) {
        this.location = location;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
    //endregion
    //endregion
}
