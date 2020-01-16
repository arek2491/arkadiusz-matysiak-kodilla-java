package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

        @Test
        public void testGetToDoList() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Board board = context.getBean(Board.class);
            TaskList toDoListExample = board.getToDoList();
            System.out.println(toDoListExample);
            Assert.assertEquals(0, toDoListExample.getTasksList().size());
        }

        @Test
        public void testGetInProgressList() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Board board = context.getBean(Board.class);
            TaskList inProgressListExample = board.getInProgressList();
            System.out.println(inProgressListExample);
            Assert.assertEquals(0, inProgressListExample.getTasksList().size() );
        }

        @Test
        public void testGetDoneList() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        TaskList doneListExample = board.getDoneList();
        System.out.println(doneListExample);
        Assert.assertEquals(0, doneListExample.getTasksList().size());
    }

    @Test
    public void testTaskAdd() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Board board = context.getBean(Board.class);
            board.getToDoList().getTasksList().add("Adding to do task");
            board.getInProgressList().getTasksList().add("Adding in progress task");
            board.getDoneList().getTasksList().add("Adding done task");
            TaskList toDoListExampleAfterAdding = board.getToDoList();
            TaskList inProgressListExampleAfterAdding = board.getInProgressList();
            TaskList doneListExampleAfterAdding = board.getDoneList();

            System.out.println(toDoListExampleAfterAdding);
            System.out.println(inProgressListExampleAfterAdding);
            System.out.println(doneListExampleAfterAdding);

            Assert.assertEquals(1, toDoListExampleAfterAdding.getTasksList().size());
            Assert.assertEquals(1, inProgressListExampleAfterAdding.getTasksList().size());
            Assert.assertEquals(1, doneListExampleAfterAdding.getTasksList().size());
        }
}
