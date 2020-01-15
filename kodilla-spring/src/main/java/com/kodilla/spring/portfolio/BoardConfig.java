package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    Board board;

    @Bean
    public Board getBoard() {
        return new Board();
    }

   @Bean
   public TaskList getToDoList() {
        return new Board().getToDoList();
   }

    @Bean
    public TaskList getInProgressList() {
        return new Board().getInProgressList();
    }

    @Bean
    public TaskList getDoneList() {
        return new Board().getDoneList();
    }


}
