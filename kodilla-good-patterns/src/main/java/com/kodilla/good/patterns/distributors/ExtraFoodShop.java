package com.kodilla.good.patterns.distributors;

public class ExtraFoodShop implements OrderExecute {

    public void process() {
        System.out.println("Verifying");
        Product product = new Product("Fruits" , 10);
        Order order = new Order(product, 10);
        System.out.println(order + "Accepted");
    }
}
