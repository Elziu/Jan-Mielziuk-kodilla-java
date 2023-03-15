package com.kodilla.good.patterns.challenges.orders;

public class User {

    private String name;
    private String surname;
    private int userId;

    public User(String name, String surname, int userId) {
        this.name = name;
        this.surname = surname;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (!name.equals(user.name)) return false;
        return surname.equals(user.surname);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + surname.hashCode();
        result = 31 * result + userId;
        return result;
    }
}
