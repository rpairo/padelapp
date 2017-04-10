package com.nitsnets.padelapp.models;

/**
 * Created by raul on 10/4/17.
 */

public class Commentary {

    //region Variables
    private Player author;
    private String date;
    private String text;
    //endregion

    //region Constructors
    public Commentary() {
        this.author = null;
        this.date = null;
        this.text = null;
    }
    //endregion

    //region Getters and setters
    //region Getters
    public Player getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }
    //endregion

    //region Setters
    public void setAuthor(Player author) {
        this.author = author;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }
    //endregion
    //endregion
}
