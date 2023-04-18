package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightServiceImpl implements  FlightService {

    public final List<Flight> flights;

    public FlightServiceImpl(List<Flight> flights) {
        this.flights = flights;
    }

    @Override
    public void searchFlightToDestination(String destinationAirPort) {
        System.out.println("Searching Flights to Desination:" );

        List<Flight> filteredFlights = flights.stream()
                .filter(flight -> flight.getEndDestination().equals(destinationAirPort))
                .collect(Collectors.toList());

        System.out.println("# elements: " + filteredFlights.size());
        filteredFlights.stream()
                .forEach(System.out::println);

    }

    @Override
    public void searchFlightFromDestination(String startingAirPort) {
        System.out.println("Searching Flights from Desination:" );

        List<Flight> filteredFlights = flights.stream()
                .filter(flight -> flight.getStartDestination().equals(startingAirPort))
                .collect(Collectors.toList());

        System.out.println("# elements: " + filteredFlights.size());
        filteredFlights.stream()
                .forEach(System.out::println);


    }

    @Override
    public void searchFlightThroughDestination(String startingAirPort, String destinationAirPort) {
        System.out.println("Searching possible flight travels from " + startingAirPort + " to " + destinationAirPort + "." );
        List<Flight> startAirport = flights.stream()
                .filter(flight -> flight.getStartDestination().equals(startingAirPort))
                .collect(Collectors.toList());



        System.out.println("# elements: " + startAirport.size());
        startAirport.stream()
                .forEach(System.out::println);


    }
}
