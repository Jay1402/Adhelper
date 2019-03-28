package com.example.omkar.adhelper;

public class product {

    private int id;
    private String title, desc;
    private double rating, price;
    private int image;

    public product(int id, String title, String desc, double rating, double price, int image) {
        this.id = id;
        this.title = title;
        this.desc = desc;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public double getRating() {
        return rating;
    }

    public double getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
