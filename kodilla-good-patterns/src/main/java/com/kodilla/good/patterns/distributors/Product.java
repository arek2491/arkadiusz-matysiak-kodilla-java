package com.kodilla.good.patterns.distributors;

public class Product {

    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return price;
    }

    public String toString() {
        return getProductName() + " " + getQuantity();
    }
}
