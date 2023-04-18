package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightsBase {

    public List<Flight> addFlights(){
        List<Flight> flightList = new ArrayList<>();

        Flight flight1 = new Flight("GDANSK" , "SUWALKI" ,"SOSNOWIEC");
        Flight flight2 = new Flight("GDANSK" , "WARSZAWA" ,"SUWALKI" );
        Flight flight3 = new Flight("WARSZAWA" , "MOSKWA" ,"SUWALKI");
        Flight flight4 = new Flight("SUWALKI" , "SOSNOWIEC" ,"WARSZAWA");
        Flight flight5= new Flight("GDANSK" , "SOSNOWIEC" ,"SUWALKI");
        Flight flight6 = new Flight("GDANSK" , "LONDYN" ,"SUWALKI");

        Flight flight7 = new Flight("GDANSK" , "LONDYN" , "MOSKWA" );
        Flight flight8 = new Flight("GDANSK" , "MEKSYK" , "WARSZAWA");
        Flight flight9 = new Flight("GDANSK" , "LONDYN" , "WARSZAWA" );
        Flight flight10 = new Flight("KATOWICE" , "SOSNOWIEC" , "SUWALKI"  );
        Flight flight11 = new Flight("KATOWICE" , "LONDYN" , "MOSKWA" );
        Flight flight12 = new Flight("GDANSK" , "KATOWICE" , "WARSZAWA" );


        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);
        flightList.add(flight5);
        flightList.add(flight6);
        flightList.add(flight7);
        flightList.add(flight8);
        flightList.add(flight9);
        flightList.add(flight10);
        flightList.add(flight11);
        flightList.add(flight12);



        return flightList;
    }
}
