package com.kodilla.exception.test;

public class MainAirport {
    public static void main(String[] args) {

        try{
            Flight flight = new Flight("Italy", "asdf" );
            FlightFinder findFlight = new FlightFinder();
            findFlight.findFlight(flight);

        }catch (RouteNotFoundException e){
            System.out.println("Please check again given destination.");
        }



    }
}
