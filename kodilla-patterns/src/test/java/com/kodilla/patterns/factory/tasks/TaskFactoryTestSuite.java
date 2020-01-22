package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDriving() {
        TaskFactory taskFactory = new TaskFactory();
        Task drivingTask = taskFactory.makeTask(TaskFactory.DRIVING);
        Assert.assertEquals("name1", drivingTask.getTaskName());
        Assert.assertTrue(drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryShopping() {
        TaskFactory taskFactory = new TaskFactory();
        Task shoppingTask = taskFactory.makeTask(TaskFactory.SHOPPING);
        Assert.assertEquals("name2", shoppingTask.getTaskName());
        Assert.assertTrue(shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        TaskFactory taskFactory = new TaskFactory();
        Task paintingTask = taskFactory.makeTask((TaskFactory.PAINTING));
        Assert.assertEquals("name3", paintingTask.getTaskName());
        Assert.assertTrue(paintingTask.isTaskExecuted());
    }
}
