package com.nitsnets.padelapp.models;

/**
 * Created by raul on 10/4/17.
 */

public class Club {

    //region Variables
    private String address;
    private String logo;
    private String backdrop;
    private String prefix;
    private String name;
    //endregion

    //region Constructors
    public Club() {
        this.address = null;
        this.logo = null;
        this.backdrop = null;
        this.prefix = null;
        this.name = null;
    }
    //endregion

    //region Getters and setters
    //region Getters
    public String getAddress() {
        return address;
    }

    public String getLogo() {
        return logo;
    }

    public String getBackdrop() {
        return backdrop;
    }

    public String getPrefix() {
        return prefix;
    }

    public String getName() {
        return name;
    }
    //endregion

    //region Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setBackdrop(String backdrop) {
        this.backdrop = backdrop;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public void setName(String name) {
        this.name = name;
    }
    //endregion
    //endregion
}
