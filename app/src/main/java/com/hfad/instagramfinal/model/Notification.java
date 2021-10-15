package com.hfad.instagramfinal.model;

public class Notification {

    private String userName;
    private int imageUrl;

    public Notification(String userName, int imageurl) {
        this.userName = userName;
        this.imageUrl = imageurl;
    }

    public String getUserName() {
        return userName;
    }

    public int getImageurl() {
        return imageUrl;
    }
}
