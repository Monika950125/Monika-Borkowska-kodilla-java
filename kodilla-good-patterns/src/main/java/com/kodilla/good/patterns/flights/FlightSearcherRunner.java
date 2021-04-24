package com.kodilla.good.patterns.flights;

public class FlightSearcherRunner {
    public static void main(String[] args) {
        FlightBase flightBase = new FlightBase();
        flightBase.addFlightsToBase();
        Flight flight = new Flight("Warszawa", "Waszyngton");
//        System.out.println(flightBase.findConnectingFlight(flight));
//        flightBase.addFlightInList(flight);


    }
}
