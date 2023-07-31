package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerObservers(Observer observer);
    void notifyObservers();
}
