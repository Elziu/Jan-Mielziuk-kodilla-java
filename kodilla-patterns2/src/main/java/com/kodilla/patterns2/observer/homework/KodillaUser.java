package com.kodilla.patterns2.observer.homework;

public class KodillaUser extends UserTaskQueue{
    private String userName;
    private int updateCount;

    public KodillaUser(String userName) {
        super(userName);
    }


    public String getUserName() {
        return userName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
