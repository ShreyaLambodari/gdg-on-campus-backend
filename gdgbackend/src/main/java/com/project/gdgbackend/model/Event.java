package com.project.gdgbackend.model;

public class Event {
    protected Long id;
    protected String title;
    protected String date;
    protected String imageurl;
    protected String registration;

    public Event(Long id, String title, String date, String imageurl, String registration){
        this.id = id;
        this.title = title;
        this.date = date;
        this.imageurl = imageurl;
        this.registration = registration;
    }

    public Long getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDate(){
        return date;
    }
    public String getImageurl(){
        return imageurl;
    }
    public String getRegistration(){
        return registration;
    }
}
