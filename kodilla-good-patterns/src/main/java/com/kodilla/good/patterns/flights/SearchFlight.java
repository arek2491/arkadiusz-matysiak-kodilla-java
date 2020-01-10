package com.kodilla.good.patterns.flights;


public class SearchFlight {

    private FlightList flightList;

    public SearchFlight() {
        flightList = new FlightList();
    }

    public void SearchByStartCity(String city) {
        flightList.getFlightList().stream()
                .limit(flightList.getFlightList().size())
                .filter(flight -> flight.getStartCity().equals(city))
                .forEach(System.out::println);
    }

    public void SearchByThroughCity(String city) {
        flightList.getFlightList().stream()
                .limit(flightList.getFlightList().size())
                .filter(flight -> flight.getThroughCity().equals(city))
                .forEach(System.out::println);
    }

    public void SearchByLandingCity(String city) {
        flightList.getFlightList().stream()
                .limit(flightList.getFlightList().size())
                .filter(flight -> flight.getLandingCity().equals(city))
                .forEach(System.out::println);
    }
}
