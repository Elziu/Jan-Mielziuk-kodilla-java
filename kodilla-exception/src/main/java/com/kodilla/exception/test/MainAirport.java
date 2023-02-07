package com.kodilla.exception.test;

public class MainAirport {
    public static void main(String[] args) {

        try{
            Flight flight = new Flight("Italy", "asdf" );
            FlightFinder findFlight = new FlightFinder();

            if (findFlight.findFlight(flight)) {
                System.out.println("Flight avaiable.");

            } else {
                System.out.println("Flight unavaiable.");
            }

        } catch (RouteNotFoundException e){
            System.out.println("Please check again given destination.");
        }



    }
}
