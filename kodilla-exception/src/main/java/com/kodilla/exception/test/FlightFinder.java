package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightTo = new HashMap<>();

        flightTo.put("Poland", true);
        flightTo.put("Germany", false);
        flightTo.put("Italy", true);

        if (flightTo.containsKey(flight.getArrivalAirport())
                && flightTo.containsKey(flight.getDepartureAirport())
                && flightTo.get(flight.getArrivalAirport())
                && flightTo.get(flight.getDepartureAirport())
        ) {
            System.out.println("Flight avaiable.");
        } else if(flightTo.containsKey(flight.getArrivalAirport())
                && flightTo.containsKey(flight.getDepartureAirport())
                && (flightTo.get(flight.getArrivalAirport()) == false
                || flightTo.get(flight.getDepartureAirport()) == false))
                 {
            System.out.println("Flight unavaiable");

        } else {
            throw new RouteNotFoundException();
        }


    }


}
