package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean wasExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.wasExecuted = false;
    }



    @Override
    public String executeTask() {
        return "Executing driving task:";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        wasExecuted = true;
        return true;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
