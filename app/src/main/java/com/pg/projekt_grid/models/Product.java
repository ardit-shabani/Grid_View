package com.pg.projekt_grid.models;

public class Product {
    private int companyImage;
    private String companyName;

    public Product(int companyImage, String companyName) {
        this.companyImage = companyImage;
        this.companyName = companyName;

    }

    public int getProductImage() {
        return companyImage;
    }

    public String getProductName() {
        return companyName;
    }
}