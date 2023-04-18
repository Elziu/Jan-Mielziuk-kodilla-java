package com.kodilla.good.patterns.flights;

import java.util.List;

public interface FlightService {

    List<Flight> searchFlightToDestination(String destinationAirPort);
    List<Flight> searchFlightFromDestination(String startingAirPort);
    List<Flight> findConnectingFlights(String startingAirPort, String destinationAirPort, String connectingAirport);
}
