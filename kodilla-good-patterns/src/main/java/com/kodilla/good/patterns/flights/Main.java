package com.kodilla.good.patterns.flights;

public class Main {
    public static void main(String[] args) {
        FlightsBase flightsBase = new FlightsBase();
        FlightServiceImpl flightService = new FlightServiceImpl(flightsBase.addFlights());

        flightService.searchFlightFromDestination("GDANSK");
        flightService.searchFlightThroughDestination("WARSZAWA");
        flightService.searchFlightToDestination("LONDYN");
    }
}
