package com.nitsnets.padelapp.models;

import com.nitsnets.padelapp.enums.Gender;

/**
 * Created by raul on 31/3/17.
 */

public class Player {

    //region Variables
    private String name;
    private String lastName;
    private Gender gender;
    private String email;
    private String password;
    private String birthdate;
    private String phone;
    private boolean federated;
    private String photo;
    private int level;
    private int points;
    private Player[] friends;
    private Player[] usersBlocked;
    private Match[] matches;
    private Availability availability;
    private Notification[] notifications;
    private final boolean[] notificationsPreferences = new boolean[9];
    //endregion

    //region Constructors
    public Player() {
        this.name = null;
        this.lastName = null;
        this.gender = null;
        this.email = null;
        this.password = null;
        this.birthdate = null;
        this.phone = null;
        this.federated = false;
        this.photo = null;
        this.level = 0;
        this.points = 0;
        this.friends = null;
        this.usersBlocked = null;
        this.matches = null;
        this.availability = null;
        this.notifications = null;
    }
    //endregion

    //region Getters and setters
    //region Getters
    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public String getPhone() {
        return phone;
    }

    public boolean isFederated() {
        return federated;
    }

    public String getPhoto() {
        return photo;
    }

    public int getLevel() {
        return level;
    }

    public int getPoints() {
        return points;
    }

    public Player[] getFriends() {
        return friends;
    }

    public Player[] getUsersBlocked() {
        return usersBlocked;
    }

    public Match[] getMatches() {
        return matches;
    }

    public Availability getAvailability() {
        return availability;
    }

    public Notification[] getNotifications() {
        return notifications;
    }

    public boolean[] getNotificationsPreferences() {
        return notificationsPreferences;
    }
    //endregion

    //region Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setFederated(boolean federated) {
        this.federated = federated;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setFriends(Player[] friends) {
        this.friends = friends;
    }

    public void setUsersBlocked(Player[] usersBlocked) {
        this.usersBlocked = usersBlocked;
    }

    public void setMatches(Match[] matches) {
        this.matches = matches;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public void setNotifications(Notification[] notifications) {
        this.notifications = notifications;
    }
    //endregion
    //endregion
}
