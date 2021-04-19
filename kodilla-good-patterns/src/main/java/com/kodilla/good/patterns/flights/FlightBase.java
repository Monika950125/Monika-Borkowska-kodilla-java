package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class FlightBase {

    private final List<Flight> base = new ArrayList<>();
//            new Flight("Dubrownik", "Piza"),
//            new Flight("Szczecin", "Zielona Góra"),
//            new Flight("Warszawa", "Moskwa"),
//            new Flight("Warszawa", "Paryż"),
//            new Flight("Paryż", "Waszyngton"),
//            new Flight("Warszawa", "Londyn"),
//            new Flight("Londyn", "San Francisco"),
//            new Flight("Piza", "Werona")


    public List<Flight> getBase() {
        return base;
    }

    public List<Flight> showBase(){
        return base;
    }

    public List<Flight> addFlightInList(Flight flight) {
        base.add(flight);
        return base;
    }

    public boolean searchFlight(Flight flight){
       return base.contains(flight);
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
