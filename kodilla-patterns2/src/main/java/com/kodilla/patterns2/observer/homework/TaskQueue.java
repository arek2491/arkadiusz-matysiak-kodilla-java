package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements TaskObservable {
    private final String taskName;
    private final List<TaskObserver> observers;
    private final List<OptionalClassTask> tasks;

    public TaskQueue(String taskName) {
        this.taskName = taskName;
        observers = new ArrayList<>();
        tasks= new ArrayList<>();
    }

    public void addTask(OptionalClassTask task) {
        tasks.add(task);
        notifyObserver();
    }

    @Override
    public void registerObserver(TaskObserver taskObserver) {
        observers.add(taskObserver);
    }

    @Override
    public void notifyObserver() {
        for(TaskObserver taskObserver : observers) {
            taskObserver.update(this);
        }
    }

    @Override
    public void removeObserver(TaskObserver taskObserver) {
        observers.remove(taskObserver);
    }

    public String getTaskName() {
        return taskName;
    }

    public List<OptionalClassTask> getTasks() {
        return tasks;
    }
}
