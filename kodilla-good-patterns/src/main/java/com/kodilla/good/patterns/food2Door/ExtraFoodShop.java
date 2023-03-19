package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraFoodShop extends Producer implements ProducerService, InformationService {

    Product milk = new Product("Milk", 5, 15);
    Product flour = new Product("Flour", 3, 15);

    List<Product> products = Arrays.asList(milk, flour);



    public ExtraFoodShop() {

        super("Extra Food Shop", new ArrayList<>());

    }
    @Override
    public void producerInfo(Producer producer) {

        System.out.println(producer.toString());

    }

    @Override
    public void process() {

        System.out.println("Sending information about quantity and kind of products to Extra Food Shop.");

    }
}
