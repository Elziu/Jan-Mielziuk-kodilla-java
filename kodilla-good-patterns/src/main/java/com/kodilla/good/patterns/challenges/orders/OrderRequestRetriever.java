package com.kodilla.good.patterns.challenges.orders;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {

        User user = new User("John", "Snow", 1999);
        Product product = new Product("Headphones", 99);
        Order order = new Order(product, 5);

        return new OrderRequest(user, product, order);
    }
}
