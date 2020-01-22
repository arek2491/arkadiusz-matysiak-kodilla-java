package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private String taskName;
    private String whatToBuy;
    private double quantity;
    private static ShoppingTask shoppingTaskInstance = null;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    public ShoppingTask getInstance() {
        if(shoppingTaskInstance == null) {
            shoppingTaskInstance = new ShoppingTask(taskName, whatToBuy, quantity);
        }
        return shoppingTaskInstance;
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

        boolean isDoneFlag;

        if(getInstance() == null) {
            isDoneFlag = false;
        } else {
            isDoneFlag = true;
        }
        return isDoneFlag;
    }

    public double getQuantity() {
        return quantity;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }


}
