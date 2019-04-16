package com.nitsnets.padelapp.models;

/**
 * Created by raul on 30/3/17.
 */

public class Result {

    //region Variables
    private Player confirmedPlayer;
    private Player scorerPlayer;
    private final String[][] score = new String[2][3]; // array 0 = teams, array 1 = scores
    //endregion

    //region Constructors
    public Result() {
        this.confirmedPlayer = null;
        this.scorerPlayer = null;
    }
    //endregion

    //region Getters and setters
    //region Getters
    public Player getConfirmedPlayer() {
        return confirmedPlayer;
    }

    public Player getScorerPlayer() {
        return scorerPlayer;
    }

    public String[][] getScore() {
        return score;
    }
    //endregion

    //region Setters
    public void setConfirmedPlayer(Player confirmedPlayer) {
        this.confirmedPlayer = confirmedPlayer;
    }

    public void setScorerPlayer(Player scorerPlayer) {
        this.scorerPlayer = scorerPlayer;
    }
    //endregion
    //endregion
}
