package com.myapplication.recycleview;

public class UserModel {
    private String name;
    private String email;
    private int imgName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getImgName() {
        return imgName;
    }

    public void setImgName(int imgName) {
        this.imgName = imgName;
    }

    public UserModel(String name, String email, int imgName) {
        this.name = name;
        this.email = email;
        this.imgName = imgName;
    }
}
