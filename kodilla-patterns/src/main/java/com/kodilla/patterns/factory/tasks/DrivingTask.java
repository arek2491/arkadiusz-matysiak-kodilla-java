package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private static DrivingTask drivingTaskInstance = null;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    public DrivingTask getInstance() {
        if(drivingTaskInstance == null) {
            drivingTaskInstance = new DrivingTask(taskName, where, using);
        }
        return drivingTaskInstance;
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

        boolean isDoneFlag;

      if(getInstance() == null) {
          isDoneFlag = false;
      } else {
          isDoneFlag = true;
      }
      return isDoneFlag;
    }

    public String getWhere() {
        return where;
    }

    public String getUsing() {
        return using;
    }
}
