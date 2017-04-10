package com.nitsnets.padelapp.models;

/**
 * Created by raul on 11/4/17.
 */

public class Complaint {

    //region Variables
    private Player denouncer;
    private String reason;
    private String verdict;
    //endregion

    //region Constructor
    public Complaint() {
        this.denouncer = null;
        this.reason = null;
        this.verdict = null;
    }
    //endregion

    //region Getters and setters
    //region Getters
    public Player getDenouncer() {
        return denouncer;
    }

    public String getReason() {
        return reason;
    }

    public String getVerdict() {
        return verdict;
    }
    //endregion

    //region Setters
    public void setDenouncer(Player denouncer) {
        this.denouncer = denouncer;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setVerdict(String verdict) {
        this.verdict = verdict;
    }
    //endregion
    //endregion
}
