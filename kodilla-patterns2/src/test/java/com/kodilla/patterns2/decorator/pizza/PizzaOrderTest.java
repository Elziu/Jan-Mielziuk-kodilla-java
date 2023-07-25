package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTest {
    @Test
    public void PizzaDecoratorGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaDecorator();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);
        theOrder = new ShrimpsDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(new BigDecimal(33), theCost);
    }

    @Test
    public void PizzaDecoratorGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaDecorator();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new MeatDecorator(theOrder);
        theOrder = new ShrimpsDecorator(theOrder);

        //When
        String description = theOrder.getDescription();

        //Then
        assertEquals("Pizza with cheese and sauce + extra cheese + meat + shrimps", description);

    }
}
