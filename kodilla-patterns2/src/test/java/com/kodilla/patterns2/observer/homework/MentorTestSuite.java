package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorTestSuite {
    @Test
    public void testUpdate() {
        TaskQueue easyTasks = new TasksWhichAreVeryEasy();
        TaskQueue mediumTasks = new TasksWhichAreOnMediumLevel();
        TaskQueue difficultTasks = new TasksWhichAreVeryDifficult();
        Mentor zenonKowalski = new Mentor("Zenon Kowalski");
        Mentor włodzimierzNowak = new Mentor("Włodzimierz Nowak");
        easyTasks.registerObserver(zenonKowalski);
        mediumTasks.registerObserver(włodzimierzNowak);
        difficultTasks.registerObserver(włodzimierzNowak);
        easyTasks.registerObserver(włodzimierzNowak);

        easyTasks.addTask(new OptionalClassTask("task1", "'While' loop in practice"));
        easyTasks.addTask(new OptionalClassTask("task2", "'For' loop in practice"));
        mediumTasks.addTask(new OptionalClassTask("task3", "Condition 'if' in practice"));
        difficultTasks.addTask(new OptionalClassTask("task4", "Kodilla exercise 20.4" ));
        difficultTasks.addTask(new OptionalClassTask("task5", "Kodilla exercise 20.5"));
        difficultTasks.addTask(new OptionalClassTask("task6", "Kodilla exercise 21.1"));

        Assert.assertEquals(2, zenonKowalski.getUpdateCount());
        Assert.assertEquals(6, włodzimierzNowak.getUpdateCount());

    }
}
