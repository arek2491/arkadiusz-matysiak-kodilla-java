package com.kodilla.good.patterns.distributors;

public class HealthyShop implements OrderExecute {

    public void process() {
        System.out.println("Verifying...");
        Order order = new Order(new Product("Vegetables" , 10) , 40);
        System.out.println("Order Accepted");
    }
}
