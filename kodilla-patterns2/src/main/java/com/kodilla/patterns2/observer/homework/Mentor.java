package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(TaskQueue taskQueue) {
        System.out.println(name + " You have new task to check! \n " +
                "Task is in: " + taskQueue.getTaskName() + " queue" + "\n" +
                 "(total: " + taskQueue.getTasks().size() + " tasks)");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
