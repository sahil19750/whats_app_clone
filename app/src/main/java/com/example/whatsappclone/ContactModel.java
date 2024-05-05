package com.example.whatsappclone;

public class ContactModel {

     private int img,logo;
    private String name,time,country;

    public int getImg() {
        return img;
    }
    public int getLogo() {
        return logo;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getCountry() {
        return country;
    }



    public ContactModel(int image, String text_name, String text_time, String text_country, int call_icon){
        this.img=image;
        this.name=text_name;
        this.time=text_time;
        this.country=text_country;
        this.logo=call_icon;
    }
}
