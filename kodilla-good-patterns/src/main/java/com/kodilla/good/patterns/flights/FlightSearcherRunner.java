package com.kodilla.good.patterns.flights;

public class FlightSearcherRunner {
    public static void main(String[] args) {
        FlightBase flightBase = new FlightBase();
        System.out.println(flightBase.showBase());
        Flight flight = new Flight("Londyn", "Werona");
        System.out.println(flightBase.searchFlight(flight));
//        flightBase.addFlightInList(flight);
        System.out.println(flightBase.searchFlight(flight));

    }
}
