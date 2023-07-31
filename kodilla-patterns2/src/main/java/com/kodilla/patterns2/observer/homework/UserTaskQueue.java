package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class UserTaskQueue implements Observable{
    private final List<Observer> observers;
    private final ArrayDeque<String> listOfTasks;
    private final String name;

    public UserTaskQueue(String name) {
        observers = new ArrayList<>();
        listOfTasks = new ArrayDeque<>();
        this.name = name;
    }

    public void addTask(String taskName){
        listOfTasks.offer(taskName);
        notifyObservers();
    }

    @Override
    public void registerObservers(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers){
            observer.update(this);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public ArrayDeque<String> getListOfTasks() {
        return listOfTasks;
    }

    public String getName() {
        return name;
    }
}
