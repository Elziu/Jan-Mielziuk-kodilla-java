package com.kodilla.good.patterns.flights;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlightsBase flightsBase = new FlightsBase();
        FlightServiceImpl flightService = new FlightServiceImpl(flightsBase.addFlights());

        List<Flight> flightsFrom = flightService.searchFlightFromDestination("GDANSK");
        for (Flight flight : flightsFrom) {
            System.out.println(flight);
        }

        List<Flight> flightsTo = flightService.searchFlightToDestination("LONDYN");
        for (Flight flight : flightsTo) {
            System.out.println(flight);
        }

        List<Flight> flightsToWithConnectingAirport = flightService.findConnectingFlights("GDANSK", "MOSKWA", "WARSZAWA");
        for (Flight flight : flightsToWithConnectingAirport) {
            System.out.println(flight);
        }
    }
}
