package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByThroughCity extends FlightList implements SearchFlight {

    public SearchByThroughCity() {
        super();
    }

    @Override
    public List<Flight> search(String city) {
        return getFlightList().stream()
                .limit(getFlightList().size())
                .filter(flight -> flight.getThroughCity().equals(city))
                .collect(Collectors.toList());
    }
}
