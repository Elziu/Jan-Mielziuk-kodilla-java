package com.kodilla.patterns.factory.tasks;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.makeTask(TaskFactory.SHOPPINGTASK);
        boolean resultBeforeExecuteTask = shopping.isTaskExecuted();
        shopping.executeTask();
        boolean resultAfterExecuteTask = shopping.isTaskExecuted();
        //Then
        assertEquals("Shopping", shopping.getTaskName());
        assertFalse(resultBeforeExecuteTask);
        assertTrue(resultAfterExecuteTask);
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.makeTask(TaskFactory.PAINTINGTASK);
        boolean resultBeforeExecuteTask = painting.isTaskExecuted();
        painting.executeTask();
        boolean resultAfterExecuteTask = painting.isTaskExecuted();

        //Then
        assertEquals("Painting", painting.getTaskName());
        assertFalse(resultBeforeExecuteTask);
        assertTrue(resultAfterExecuteTask);
    }

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.makeTask(TaskFactory.DRIVINGTASK);
        boolean resultBeforeExecuteTask = driving.isTaskExecuted();
        driving.executeTask();
        boolean resultAfterExecuteTask = driving.isTaskExecuted();
        //Then
        assertEquals("Driving", driving.getTaskName());
        assertFalse(resultBeforeExecuteTask);
        assertTrue(resultAfterExecuteTask);
    }
}