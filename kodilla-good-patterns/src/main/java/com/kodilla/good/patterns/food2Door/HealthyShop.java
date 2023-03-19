package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;

public class HealthyShop extends Producer implements ProducerService, InformationService {

    public HealthyShop() {

        super("Healthy Shop", new ArrayList<>());

    }
    @Override
    public void producerInfo(Producer producer) {

        System.out.println(producer.toString());

    }

    @Override
    public void process() {

        System.out.println("Sending information about quantity and kind of products to Healthy Shop.");


    }
}


