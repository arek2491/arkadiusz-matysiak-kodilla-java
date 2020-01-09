package com.kodilla.good.patterns.distributors;

public class Order {

    private Product product;
    private int quantity;

    public Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return getProduct() +" " + getQuantity();
    }
}
