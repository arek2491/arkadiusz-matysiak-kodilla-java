package com.kodilla.good.patterns.distributors;


public class OrderExecutor {

    private OrderExecute orderExecute;

    public OrderExecutor(OrderExecute orderExecute) {
        this.orderExecute = orderExecute;
    }
    public void execute() {
        System.out.println("Process...");
        this.orderExecute.process();
        System.out.println("Done");
    }

}
