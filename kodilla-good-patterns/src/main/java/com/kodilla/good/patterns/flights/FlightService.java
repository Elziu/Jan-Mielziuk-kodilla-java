package com.kodilla.good.patterns.flights;

public interface FlightService {

    void searchFlightToDestination(String destinationAirPort);
    void searchFlightFromDestination(String startingAirPort);
    void searchFlightThroughDestination(String startingAirPort, String destinationAirPort);
}
