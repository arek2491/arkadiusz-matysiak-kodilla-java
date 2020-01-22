package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
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
    public boolean isTaskExecuted(double quantityCheck) {

        boolean isDoneFlag;

        if(quantityCheck == getQuantity()) {
            isDoneFlag = true;
        }else {
            isDoneFlag = false;
        }
        return isDoneFlag;
    }

}
