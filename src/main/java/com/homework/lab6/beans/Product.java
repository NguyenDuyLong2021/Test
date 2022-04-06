package com.homework.lab6.beans;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serializableVersionId = 1;
    private int id;
    private String nameProduct;
    private String image;
    private double price;
    private double priceSell;

    public Product(int id, String nameProduct, String image, double price, double priceSell) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.image = image;
        this.price = price;
        this.priceSell = priceSell;
    }

    @Override
    public String toString() {
        return id + '\t' + nameProduct + '\t' + image + '\t' + price + '\t' + priceSell + '\n';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPriceSell() {
        return priceSell;
    }

    public void setPriceSell(double priceSell) {
        this.priceSell = priceSell;
    }
}
