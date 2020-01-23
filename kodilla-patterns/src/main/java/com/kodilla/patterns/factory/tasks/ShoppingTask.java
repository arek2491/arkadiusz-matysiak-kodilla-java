package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private boolean wasExecuted;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
        this.wasExecuted = false;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "Execute: " + getTaskName();
    }

    @Override
    public boolean isTaskExecuted() {

        wasExecuted = true;
        return true;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }


}
