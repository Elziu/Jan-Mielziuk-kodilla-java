package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class Producer {

    private String producerName;
    private List<Product> products;

    public Producer(String producerName, List<Product> products) {
        this.producerName = producerName;
        this.products = products;
    }


    @Override
    public String toString() {
        return "Producer{" +
                "producerName='" + producerName + '\'' +
                ", products=" + products +
                '}';
    }
}
