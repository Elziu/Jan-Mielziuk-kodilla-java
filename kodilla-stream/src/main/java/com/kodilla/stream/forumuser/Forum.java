package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(6432, "Jan Nowak", 'M', 1961, 6,1, 15));
        userList.add(new ForumUser(6543, "Mikołaj Strzelczyk", 'M', 1966,4,2, 16));
        userList.add(new ForumUser(1234, "Monika Foremka", 'F',1962, 3,3, 65));
        userList.add(new ForumUser(7345, "Mateusz Kubicki", 'M',2000, 6, 4, 34));
        userList.add(new ForumUser(2537, "Magda Jabłońska", 'F', 2007,7,5, 3));
        userList.add(new ForumUser(2363, "Adam Kowalski", 'M',2010,5, 6, 5));
        userList.add(new ForumUser(1255, "Kunegunda Wyrypajew", 'F', 1999,10,7, 0));
        userList.add(new ForumUser(8643, "Adam Zabrockii", 'M',2012,7, 6, 6));
        userList.add(new ForumUser(5475, "Maja Przestrzelska", 'F', 1990,12,5, 74));

    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(userList);
    }
}
