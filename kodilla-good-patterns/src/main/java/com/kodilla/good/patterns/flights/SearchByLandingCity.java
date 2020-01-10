package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByLandingCity extends FlightList implements SearchFlight {

    public SearchByLandingCity() {
        super();
    }

    @Override
    public List<Flight> search(String city) {
        return getFlightList().stream()
                .limit(getFlightList().size())
                .filter(flight -> flight.getLandingCity().equals(city))
                .collect(Collectors.toList());
    }
}
