package com.kodilla.good.patterns.flights;


public class SearchFlight {

    private FlightList flightList;

    public SearchFlight() {
        flightList = new FlightList();
    }

    public void searchByStartCity(String city) {
        flightList.getFlightList().stream()
                .limit(flightList.getFlightList().size())
                .filter(flight -> flight.getStartCity().equals(city))
                .forEach(System.out::println);
    }

    public void searchByThroughCity(String city) {
        flightList.getFlightList().stream()
                .limit(flightList.getFlightList().size())
                .filter(flight -> flight.getThroughCity().equals(city))
                .forEach(System.out::println);
    }

    public void searchByLandingCity(String city) {
        flightList.getFlightList().stream()
                .limit(flightList.getFlightList().size())
                .filter(flight -> flight.getLandingCity().equals(city))
                .forEach(System.out::println);
    }
}
