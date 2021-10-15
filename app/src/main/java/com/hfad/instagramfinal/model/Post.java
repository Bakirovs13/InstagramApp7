package com.hfad.instagramfinal.model;

public class Post {
    private String description;
    private int imageurl;
    private String postid;
    private String publisher;

    public Post(String description, int imageurl, String postid, String publisher) {
        this.description = description;
        this.imageurl = imageurl;
        this.postid = postid;
        this.publisher = publisher;
    }



    public String getDescription() {
        return this.description;
    }



    public int getImageurl() {
        return this.imageurl;
    }



    public String getPostid() {
        return this.postid;
    }


    public String getPublisher() {
        return this.publisher;
    }


}
