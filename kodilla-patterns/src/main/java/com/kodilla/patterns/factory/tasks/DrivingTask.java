package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean wasExecuted = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }



    @Override
    public String executeTask() {
        wasExecuted = true;
        return "Executing driving task:";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return wasExecuted;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
