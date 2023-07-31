package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class UserTaskQueueTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Mentor mentorJohn = new Mentor("John Wick");
        Mentor mentorJackob = new Mentor("Jackob Pie");
        KodillaUser markHunt = new KodillaUser("Mark Hunt");
        KodillaUser johnDoe = new KodillaUser("John Doe");
        KodillaUser peterSmith = new KodillaUser("Peter Smith");

        markHunt.registerObservers(mentorJohn);
        johnDoe.registerObservers(mentorJackob);
        peterSmith.registerObservers(mentorJohn);

        //When
        markHunt.addTask("Create loop");
        markHunt.addTask("Find solution");
        johnDoe.addTask("Create class");
        peterSmith.addTask("Do nothing");

        //Then
        assertEquals(3, mentorJohn.getUpdateCount());
        assertEquals(1, mentorJackob.getUpdateCount());
    }
}
