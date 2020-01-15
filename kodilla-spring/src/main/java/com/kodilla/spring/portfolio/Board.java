package com.kodilla.spring.portfolio;

public final class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;


    public Board() {

        toDoList = new TaskList();
        inProgressList = new TaskList();
        doneList = new TaskList();
        toDoList.getTasksList().add("Task to do nr 1");
        toDoList.getTasksList().add("Task to do nr 2");
        inProgressList.getTasksList().add("Task in progress nr 1");
        inProgressList.getTasksList().add("Task in progress nr 2");
        doneList.getTasksList().add("Done task nr 1");
        doneList.getTasksList().add("Done task nr 2");
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}