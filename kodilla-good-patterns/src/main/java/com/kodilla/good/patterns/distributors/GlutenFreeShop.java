package com.kodilla.good.patterns.distributors;

public class GlutenFreeShop implements OrderExecute {

    public void process() {

        System.out.println("Veryfying: " + new OrderRetreiever());
        System.out.println("Order Accepted");
    }
}
