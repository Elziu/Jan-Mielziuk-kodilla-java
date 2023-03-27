package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightServiceImpl implements  FlightService {

    public final List<Flight> flights;

    public FlightServiceImpl(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public void searchFlightToDestination(String destinationAirPort) {
        System.out.println("Searching Flights to Desination:" );

        List<Flight> filteredFLights = new ArrayList<>();

        /*flights.stream()
                .filter(flight -> flight.getEndDestination().equals(destinationAirPort))
                .forEach(flight -> );*/
    }

    @Override
    public void searchFlightFromDestination(String startingAirPort) {
        System.out.println("Searching Flights from Desination:" );
        flights.stream()
                .filter(flight -> flight.getStartDestination().equals(startingAirPort))
                .forEach(System.out::println);

    }

    @Override
    public void searchFlightThroughDestination(String throughAirPort) {
        System.out.println("Searching Flights through Desination:" );
        flights.stream()
                .filter(flight -> flight.throughDestination.equals(throughAirPort))
                .forEach(System.out::println);

    }
}
