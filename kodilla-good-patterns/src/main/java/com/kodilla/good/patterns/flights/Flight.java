package com.kodilla.good.patterns.flights;

import java.util.Objects;

public class Flight {

    String startDestination;
    String endDestination;
    String throughDestination;

    public Flight(String startDestination, String endDestination, String throughDestination) {
        this.startDestination = startDestination;
        this.endDestination = endDestination;
        this.throughDestination = throughDestination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!Objects.equals(startDestination, flight.startDestination))
            return false;
        if (!Objects.equals(endDestination, flight.endDestination))
            return false;
        return Objects.equals(throughDestination, flight.throughDestination);
    }

    @Override
    public int hashCode() {
        int result = startDestination != null ? startDestination.hashCode() : 0;
        result = 31 * result + (endDestination != null ? endDestination.hashCode() : 0);
        result = 31 * result + (throughDestination != null ? throughDestination.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "startDestination='" + startDestination + '\'' +
                ", endDestination='" + endDestination + '\'' +
                ", throughDestination='" + throughDestination + '\'' +
                '}';
    }
}
