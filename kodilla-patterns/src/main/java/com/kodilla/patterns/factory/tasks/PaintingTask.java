package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{

    private String taskName;
    private String color;
    private String whatToPaint;
    private static PaintingTask paintingTaskInstance = null;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    public PaintingTask getInstance() {
        if(paintingTaskInstance == null) {
            paintingTaskInstance = new PaintingTask(taskName, color, whatToPaint);
        }
        return paintingTaskInstance;
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

    public String getColor() {
        return color;
    }

    public String getWhatToPaint() {
        return whatToPaint;
    }
}
