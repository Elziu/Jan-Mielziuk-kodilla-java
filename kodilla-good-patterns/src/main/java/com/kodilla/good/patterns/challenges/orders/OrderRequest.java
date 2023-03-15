package com.kodilla.good.patterns.challenges.orders;

public class OrderRequest {

    private final User user;
    private final Product product;
    private final Order order;

    public OrderRequest(final User user, final Product product, final Order order) {
        this.user = user;
        this.product = product;
        this.order = order;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public Order getOrder() {
        return order;
    }
}
