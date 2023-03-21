package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testToDoListTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        String task = "send emails";
        board.getDoneList().addTask(task);

        //Then
        assertEquals(task, board.getDoneList().getTasks().get(0));
    }

    @Test
    public void testInProgressTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);
        //When
        String task = "testing application";
        board.getInProgressList().addTask(task);

        //Then
        assertEquals(task, board.getDoneList().getTasks().get(0));
    }

    @Test
    public void testDoneListTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Board board = context.getBean(Board.class);

        //When
        String task = "walk a dog";
        board.getDoneList().addTask(task);

        //Then
        assertEquals(task, board.getDoneList().getTasks().get(0));
    }
}
