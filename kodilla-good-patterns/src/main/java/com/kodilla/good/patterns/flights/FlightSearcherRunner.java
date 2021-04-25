package com.kodilla.good.patterns.flights;

public class FlightSearcherRunner {

    public static void main(String[] args) {

        FlightBase flightBase = new FlightBase();
        Flight flight = new Flight("Piza", "Werona");

        System.out.println(flightBase.findConnectingFlight("Warszawa", "Waszyngton"));
        System.out.println(flightBase.findAllFlightsToThisCity("Piza"));
        System.out.println(flightBase.findAllFlightsFromThisCity("Paryż"));
    }
}
