package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {

    private String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(UserTaskQueue userTaskQueue) {
        System.out.println(mentorName + " has total of tasks: " + userTaskQueue.getListOfTasks().size());
        System.out.println("First task to validate: " + userTaskQueue.getListOfTasks().peekFirst());
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
