package com.kodilla.spring.portfolio;

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
        }

        @Test
        public void testGetInProgressList() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Board board = context.getBean(Board.class);
            TaskList InProgressListExample = board.getInProgressList();
            System.out.println(InProgressListExample);
        }

        @Test
        public void testGetDoneList() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        TaskList DoneListExample = board.getDoneList();
        System.out.println(DoneListExample);
    }

    @Test
    public void testTaskAdd() {
            ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
            Board board = context.getBean(Board.class);
            board.getToDoList().getTasksList().add("Adding to do task nr 3");
            board.getInProgressList().getTasksList().add("Adding in progress task nr 3");
            board.getDoneList().getTasksList().add("Adding done task nr 3");
            TaskList toDoListExampleAfterAdding = board.getToDoList();
            TaskList inProgressListExampleAfterAdding = board.getInProgressList();
            TaskList doneListExampleAfterAdding = board.getDoneList();
        System.out.println(toDoListExampleAfterAdding);
        System.out.println(inProgressListExampleAfterAdding);
        System.out.println(doneListExampleAfterAdding);
        }
}
