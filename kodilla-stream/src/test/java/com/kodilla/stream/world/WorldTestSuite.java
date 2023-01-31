package com.kodilla.stream.world;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test

    public void testGetPeopleQuantity(){
        //Given
        World world = new World();

        Continent europe = new Continent("Europe");
        europe.addCountry(new Country("Poland", new BigDecimal("19362758")));
        europe.addCountry(new Country("Germany", new BigDecimal("84738276")));
        europe.addCountry(new Country("Finland", new BigDecimal("284672789")));
        europe.addCountry(new Country("France", new BigDecimal("13957483")));
        europe.addCountry(new Country("Hungary", new BigDecimal("27364728")));

        Continent asia = new Continent("Asia");
        europe.addCountry(new Country("China", new BigDecimal("3821764628")));
        europe.addCountry(new Country("India", new BigDecimal("1235134634")));
        europe.addCountry(new Country("Indonesia", new BigDecimal("1265234623")));

        Continent africa = new Continent("Africa");
        europe.addCountry(new Country("Egypt", new BigDecimal("643928719")));
        europe.addCountry(new Country("Nigeria", new BigDecimal("583721612")));
        europe.addCountry(new Country("Ghana", new BigDecimal("693827381")));


        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal total = world.getPeopleQuantity();

        //Then
        BigDecimal expectedTotal = new BigDecimal("8673707631");
        Assertions.assertEquals(expectedTotal, total);




    }
}
