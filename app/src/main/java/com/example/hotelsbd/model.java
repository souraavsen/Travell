package com.example.hotelsbd;

import android.widget.RatingBar;

public class model
{
    String Address,H_Name,Image;
    float Rating;

    public model(String address, String h_Name, String image, float rating) {
        Address = address;
        H_Name = h_Name;
        Image = image;
        Rating = rating;
    }

    public String getAddress() {
        return Address;
    }

    public String getH_Name() {
        return H_Name;
    }

    public String getImage() {
        return Image;
    }

    public float getRating() {
        return Rating;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setH_Name(String h_Name) {
        H_Name = h_Name;
    }

    public void setImage(String image) {
        Image = image;
    }

    public void setRating(float rating) {
        Rating = rating;
    }
}
