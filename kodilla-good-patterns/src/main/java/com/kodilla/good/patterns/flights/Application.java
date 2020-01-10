package com.kodilla.good.patterns.flights;

public class Application {

    public static void main(String [] args) {

        SearchFlight searchFlightByStartCity = new SearchByStartCity();
        SearchFlight searchFlightByLandingCity = new SearchByLandingCity();
        SearchFlight searchFlightByThroughCity = new SearchByThroughCity();


        SearchFlightProcessor searchFlightProcessor = new SearchFlightProcessor(searchFlightByStartCity);
        SearchFlightProcessor searchFlightProcessor1 = new SearchFlightProcessor(searchFlightByLandingCity);
        SearchFlightProcessor searchFlightProcessor2 = new SearchFlightProcessor(searchFlightByThroughCity);

        System.out.println("Loty z podanego miasta: " + searchFlightProcessor.process());
        System.out.println("Loty przez podane miasto: " + searchFlightProcessor1.process());
        System.out.println("Loty do ponadego miasta: " + searchFlightProcessor2.process());
    }
}
