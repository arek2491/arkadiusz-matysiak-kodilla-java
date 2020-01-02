package com.kodilla.exception.test;

public class Main {

    public static void main(String [] args) {

        Flight flight1 = new Flight("Moscow" , "Dublin");
        Flight flight2 = new Flight("Dublin" , "Moscow");
        Flight flight3 = new Flight("Berlin" , "Malta");
        Flight flight4 = new Flight("Warsaw" , "Berlin");
        AirportService airportService = new AirportService();


        try {
            airportService.findFlight(flight1);
            airportService.findFlight(flight2);
            airportService.findFlight(flight3);
            airportService.findFlight(flight4);


        }
        catch(RouteNotFoundException e ) {
            System.out.println("Flight not found");
        }
        finally {
            System.out.println("End of search");
        }


    }
}
