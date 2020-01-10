package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightList {

    private List<Flight> flightList;
    private AvailableFlights availableFlights;

    public FlightList() {
        flightList = new ArrayList<>();
        availableFlights = new AvailableFlights();
        flightList.add(availableFlights.flight1);
        flightList.add(availableFlights.flight2);
        flightList.add(availableFlights.flight3);
        flightList.add(availableFlights.flight4);
        flightList.add(availableFlights.flight5);
        flightList.add(availableFlights.flight6);
        flightList.add(availableFlights.flight7);
        flightList.add(availableFlights.flight8);
        flightList.add(availableFlights.flight9);
    }

    public List<Flight> getFlightList() {
        return flightList;
    }
}
