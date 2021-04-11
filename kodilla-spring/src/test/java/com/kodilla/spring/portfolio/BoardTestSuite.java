package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testBoard() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When & Then
        board.showTheBoard();
    }

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        List<String> toDoList = board.getToDoList().getTasksList();
        toDoList.add("task1");

        List<String> inProgressList = board.getInProgressList().getTasksList();
        inProgressList.add("task3");

        List<String> doneList = board.getDoneList().getTasksList();
        doneList.add("task5");

        //Then
        Assertions.assertEquals("task1", toDoList.get(0));
        Assertions.assertEquals("task3", inProgressList.get(0));
        Assertions.assertEquals("task5", doneList.get(0));
    }
}
