package com.example.lab21;

public class ContactModel {
    private String name ;
    private String phone;
    private int image;

    public ContactModel(String name,String phone, int image){
        this.name = name ;
        this.image = image;
        this.phone = phone;
    }
    public String getName(){

        return name;
    }
    public String getPhone(){
        return phone;

    }
    public int getImage(){

        return image;
    }
}
