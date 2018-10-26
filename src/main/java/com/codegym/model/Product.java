package com.codegym.model;

public class Product {
    private int id;
    private String name;
    private int price;
    private String describe;
    private String maker;

    public Product() {
    }

    public Product(int id, String name, int price, String describe, String maker) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.describe = describe;
        this.maker = maker;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getDescribe() {
        return describe;
    }

    public String getMaker() {
        return maker;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
