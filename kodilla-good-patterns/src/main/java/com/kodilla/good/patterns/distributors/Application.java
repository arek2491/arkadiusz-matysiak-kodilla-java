package com.kodilla.good.patterns.distributors;

public class Application {

    public static void main(String [] args) {
        OrderExecute order1 = new ExtraFoodShop();
        OrderExecutor executor = new OrderExecutor(order1);
        executor.execute();

        OrderRetreiever orderRetreiever = new OrderRetreiever();
        Supplier supplier1 = new Supplier("SuperExtraFoodShop", orderRetreiever.retreive());
        OrderExecute order2 = new NewSupplier(supplier1);
        OrderExecutor executor1 = new OrderExecutor(order2);
        executor1.execute();

    }
}
