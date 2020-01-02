package com.kodilla.exception.test;

public class Main {

    public static void main(String [] args) {

        AirportService airportService = new AirportService();


        try {
            airportService.findFlight(new Flight("Moscow" , "Dublin"));
            airportService.findFlight(new Flight("New York" , "London"));
            airportService.findFlight(new Flight("London" , "Poznan"));
            airportService.findFlight(new Flight("Unknown Airport" , "Malta"));

        }
        catch(RouteNotFoundException e ) {
            System.out.println("Flight not found!");
        }


    }
}
