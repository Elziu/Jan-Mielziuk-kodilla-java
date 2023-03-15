package com.kodilla.good.patterns.challenges.orders;

public interface OrderRepository {

    public boolean createOrder(User user, Order order);

}
