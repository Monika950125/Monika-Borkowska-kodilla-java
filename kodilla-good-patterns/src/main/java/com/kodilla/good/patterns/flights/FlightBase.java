package com.kodilla.good.patterns.flights;

import java.util.*;
import java.util.stream.Collectors;

public class FlightBase {

    private final List<Flight> base = new ArrayList<>();
    boolean isThereAFlightInBase = false;
    String departureAirport;
    String arrivalAirport;


    public List<Flight> addFlightsToBase() {
        base.add(new Flight("Dubrownik", "Piza"));
        base.add(new Flight("Szczecin", "Zielona Góra"));
        base.add(new Flight("Warszawa", "Moskwa"));
        base.add(new Flight("Warszawa", "Paryż"));
        base.add(new Flight("Paryż", "Waszyngton"));
        base.add(new Flight("Warszawa", "Londyn"));
        base.add(new Flight("Londyn", "San Francisco"));
        base.add(new Flight("Piza", "Werona"));
        return base;
    }

    public List<Flight> getBase() {
        return base;
    }


    public List<Flight> addFlightInList(Flight flight) {
        base.add(flight);
        return base;
    }

    public Set<Flight> findDirectFlight(Flight flight) {
        Set<Flight> result = new HashSet<>();
        result = base.stream()
                .filter(flight1 -> flight1.equals(flight))
                .collect(Collectors.toSet());

        return result;
    }

    public Set<Flight> findConnectingFlight(String departureAirport, String arrivalAirport) {
        Set<Flight> results = new HashSet<>();
        List<Flight> flights = base.stream()
                .filter(flight1 -> flight1.getDepartureAirport().equals(departureAirport))
                .collect(Collectors.toList());

        List<Flight> flights1 = base.stream()
                .filter(flight1 -> flight1.getArrivalAirport().equals(arrivalAirport))
                .collect(Collectors.toList());

        for (Flight flight2 : flights1) {
            for (Flight flight1 : flights) {
                if(flight1.getArrivalAirport().equals(flight2.getDepartureAirport())){
                    results.add(flight1);
                    results.add(flight2);
                }
            }
        }

        return results;
    }


    @Override
    public String toString() {
        return "FlightBase{" +
                "base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightBase that = (FlightBase) o;
        return Objects.equals(base, that.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base);
    }
}
