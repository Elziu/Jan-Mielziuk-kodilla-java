package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;


@Configuration
public class BoardConfig {


    @Autowired
    @Qualifier("toDo")
    TaskList toDoList;

    @Autowired
    @Qualifier("inProgress")
    TaskList inProgressList;

    @Autowired
    @Qualifier("done")
    TaskList doneList;

    @Bean
    public Board getBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList getToDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList getInProgressListList() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList getDoneList() {
        return new TaskList();
    }
}

    /*@Autowired
    @Qualifier("board1")
    Board board;

    @Bean
    public TaskList getTaskList() {
        return new TaskList();
    }

    @Bean(name = "board1")
    public Board board1() {
        return new Board(getTaskList(), getTaskList(), getTaskList());
    }

    @Bean(name = "board2")
    public Board board2() {
        return new Board(getTaskList(), getTaskList(), getTaskList());
    }
    @Bean(name = "board3")
    public Board board3() {
        return new Board(getTaskList(), getTaskList(), getTaskList());
    }*/




    /*@Autowired
    @Qualifier("toDoList")
    TaskList taskList;


    @Bean(name = "toDoList")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList inProgressList() {
        return new TaskList();
    }
    @Bean(name = "doneList")
    public TaskList doneList() {
        return new TaskList();
    }*/