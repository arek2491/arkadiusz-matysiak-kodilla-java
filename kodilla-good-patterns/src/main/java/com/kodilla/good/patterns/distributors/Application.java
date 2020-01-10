package com.kodilla.good.patterns.distributors;

public class Application {

    public static void main(String [] args) {
        OrderExecute order1 = new ExtraFoodShop();
        OrderExecutor executor = new OrderExecutor(order1);
        executor.execute();

        OrderRetreiever orderRetreiever = new OrderRetreiever();
        OrderExecute order2 = new NewSupplier("ExtraFoodShop" , orderRetreiever.retreive());
        OrderExecutor executor1 = new OrderExecutor(order2);
        executor1.execute();

    }
}
