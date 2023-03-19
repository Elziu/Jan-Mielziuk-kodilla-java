package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;

public class GlutenFreeShop extends Producer implements ProducerService, InformationService {

    public GlutenFreeShop() {

        super("Gluten Free Shop", new ArrayList<>());

    }
    @Override
    public void producerInfo(Producer producer) {

        System.out.println(producer.toString());

    }

    @Override
    public void process() {

        System.out.println("Sending information about quantity and kind of products to Gluten Free Shop.");


    }
}

