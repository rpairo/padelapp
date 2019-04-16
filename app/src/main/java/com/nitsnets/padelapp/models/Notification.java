package com.nitsnets.padelapp.models;

import com.nitsnets.padelapp.enums.TypeNotification;

/**
 * Created by raul on 9/4/17.
 */

public class Notification {

    //region Variables
    private TypeNotification typeNotification;
    private boolean readed;
    private String icon;
    private String text;
    //endregion

    //region Constructors
    public Notification() {
        this.typeNotification = null;
        this.readed = false;
        this.icon = null;
        this.text = null;
    }
    //endregion

    //region Getters and setters
    //region Getters
    public TypeNotification getTypeNotification() {
        return typeNotification;
    }

    public boolean isReaded() {
        return readed;
    }

    public String getIcon() {
        return icon;
    }

    public String getText() {
        return text;
    }
    //endregion

    //region Setters
    public void setTypeNotification(TypeNotification typeNotification) {
        this.typeNotification = typeNotification;
    }

    public void setReaded(boolean readed) {
        this.readed = readed;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setText(String text) {
        this.text = text;
    }
    //endregion
    //endregion
}
