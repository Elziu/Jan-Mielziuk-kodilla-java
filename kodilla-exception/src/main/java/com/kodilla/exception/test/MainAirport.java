package com.kodilla.exception.test;

public class MainAirport {
    public static void main(String[] args) {

        try{
            Flight flight = new Flight("Italy", "Germany");
            FlightFinder findFlight = new FlightFinder();
            findFlight.findFlight(flight);

        }catch (RouteNotFoundException e){
            System.out.println("Flight not found. Airport closed or doesn't exist. ");
            System.out.println("Please check again given destination.");
        }



    }
}
