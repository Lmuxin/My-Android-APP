package com.example.muzi.myui4listview;

public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name,int imageId){
        this.name=name;
        this.imageId=imageId;
    }
    public String getNmae(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
