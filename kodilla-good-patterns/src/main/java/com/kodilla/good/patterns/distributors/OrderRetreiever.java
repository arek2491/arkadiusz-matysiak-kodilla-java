package com.kodilla.good.patterns.distributors;

public class OrderRetreiever {

    public Order retreive() {
        Product product = new Product("Apple" , 3);

        return new Order(product, 50);
    }

    public String toString() {
        return retreive() + "";
    }
}
