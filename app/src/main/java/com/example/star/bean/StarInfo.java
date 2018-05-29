package com.example.star.bean;

public class StarInfo {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StarInfo(String name, int imageId, String date) {
        this.name = name;
        this.imageId = imageId;
        this.date = date;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    private String name;
    private  int imageId;
    private  String  date;
}
