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
    public List<Flight> searchFlightToDestination(String destinationAirPort) {
        System.out.println("Searching Flights to Desination:" );

        List<Flight> flightsToDestination = flights.stream()
                .filter(flight -> flight.getEndDestination().equals(destinationAirPort))
                .collect(Collectors.toList());

        return flightsToDestination;
    }

    @Override
    public List<Flight> searchFlightFromDestination(String startingAirPort) {
        System.out.println("Searching Flights from Desination:" );

        List<Flight> flightsFromDestination = flights.stream()
                .filter(flight -> flight.getStartDestination().equals(startingAirPort))
                .collect(Collectors.toList());


        return flightsFromDestination;
    }


    public List<Flight> findConnectingFlights(String startingAirPort, String destinationAirPort, String connectingAirport) {

        System.out.println("Searching possible flight travels from " + startingAirPort + " to " + destinationAirPort + " through " + connectingAirport );

        List<Flight> departureToConnectingFlights = flights.stream()
                .filter(flight -> flight.getStartDestination().equals(startingAirPort) && flight.getEndDestination().equals(connectingAirport))
                .collect(Collectors.toList());

        List<Flight> connectingToArrivalFlights = flights.stream()
                .filter(flight -> flight.getStartDestination().equals(connectingAirport) && flight.getEndDestination().equals(destinationAirPort))
                .collect(Collectors.toList());

        List<Flight> connectingFlights = new ArrayList<>();

        connectingFlights.addAll(departureToConnectingFlights);
        connectingFlights.addAll(connectingToArrivalFlights);

        return connectingFlights;
    }
}
