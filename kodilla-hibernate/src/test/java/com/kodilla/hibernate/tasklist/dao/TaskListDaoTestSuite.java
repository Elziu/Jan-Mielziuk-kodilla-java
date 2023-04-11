package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static String LISTNAME = "Projects in progress";

    @Test
    void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, "This is list of projects in progress");
        taskListDao.save(taskList);
        //When
        List<TaskList> readTaskList = taskListDao.findByListName(LISTNAME);
        //Then
        assertEquals(1, readTaskList.size());
        //Cleanup
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
