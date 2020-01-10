package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.stream.Collectors;

public class SearchByStartCity extends FlightList implements SearchFlight{

    public SearchByStartCity() {
        super();
    }

    @Override
    public List<Flight> search(String city) {
        return getFlightList().stream()
               .limit(getFlightList().size())
               .filter(flight -> flight.getStartCity().equals(city))
               .collect(Collectors.toList());
    }
}
