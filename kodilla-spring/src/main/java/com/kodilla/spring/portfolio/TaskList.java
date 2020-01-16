package com.kodilla.spring.portfolio;


import java.util.ArrayList;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasksList() {
        return tasks;
    }

    public String toString() {
        return getTasksList()+"";
    }
}
