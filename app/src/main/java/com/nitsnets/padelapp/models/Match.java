package com.nitsnets.padelapp.models;

/**
 * Created by raul on 27/3/17.
 */

public class Match {

    //region Variables
    private String date;
    private final Team[] teams = new Team[2];
    private Club club;
    private String price;
    private final boolean[] reward = new boolean[2]; // position 0 = win, position 1 = lose
    private String level;
    private Player[] bloquedPlayers;
    private Commentary[] comments;
    private Result result;
    private Complaint complaint;
    private boolean finalized;
    //endregion

    //region Constructors
    public Match() {
        this.date = null;
        this.club = null;
        this.price = null;
        this.level = null;
        this.bloquedPlayers = null;
        this.comments = null;
        this.result = null;
        this.complaint = null;
        this.finalized = false;
    }

    public Match(String date) {
        this.date = date;
    }
    //endregion

    //region Getter and setters
    //region Getters
    public String getDate() {
        return date;
    }

    public Team[] getTeams() {
        return teams;
    }

    public Club getClub() {
        return club;
    }

    public String getPrice() {
        return price;
    }

    public boolean[] getReward() {
        return reward;
    }

    public String getLevel() {
        return level;
    }

    public Player[] getBloquedPlayers() {
        return bloquedPlayers;
    }

    public Commentary[] getComments() {
        return comments;
    }

    public Result getResult() {
        return result;
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public boolean isFinalized() {
        return finalized;
    }
    //endregion

    //region Setters
    public void setDate(String date) {
        this.date = date;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setBloquedPlayers(Player[] bloquedPlayers) {
        this.bloquedPlayers = bloquedPlayers;
    }

    public void setComments(Commentary[] comments) {
        this.comments = comments;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }

    public void setFinalized(boolean finalized) {
        this.finalized = finalized;
    }
    //endregion
    //endregion
}
