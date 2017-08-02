package com.example.btril.friend_stalker.data;

/**
 * Created by btril on 07/16/17.
 */

public class FriendsDetails {
    private String fname;
    private String lname;
    private String email;
    private long phonenumber;
    private double distance;
    private double latitude;
    private double longitude;

    public FriendsDetails() {
    }

    public FriendsDetails(String fname, String lname, String email, long phonenumber, double distance) {
        this.fname= fname;
        this.lname = lname;
        this.email = email;
        this.distance = distance;
        this.phonenumber = phonenumber;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}


