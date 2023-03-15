package com.kodilla.good.patterns.challenges.orders;

public class ProductOrderService implements OrderService{

    public boolean order(final User user, final Order order) {
        System.out.println("User: " + user.getName() + " " +user.getSurname() + " ID: " + user.getUserId() +
                "\n Ordered(" + order.getQuantity() + ") " + order.getProduct().getName() + " for: " + order.getOrderPrice());

        return true;
    }


}
