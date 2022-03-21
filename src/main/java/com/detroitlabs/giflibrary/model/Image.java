package com.detroitlabs.giflibrary.model;

public class Image {
    private String imageName;
    private String picID;

    public Image(String imageName, String picID) {
        this.imageName = imageName;
        this.picID = picID;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getPicID() {
        return picID;
    }

    public void setPicID(String picID) {
        this.picID = picID;
    }
}
