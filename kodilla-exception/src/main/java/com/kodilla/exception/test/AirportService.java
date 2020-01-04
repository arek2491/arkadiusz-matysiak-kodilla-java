package com.kodilla.exception.test;


import java.util.HashMap;



public class AirportService {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> testFlight = new HashMap<>();
        testFlight.put("Dublin", true);
        testFlight.put("Moscow", true);
        testFlight.put("Poznan", true);
        testFlight.put("Malta", true);


            if (testFlight.containsKey(flight.getArrivalAirport()) && testFlight.get(flight.getArrivalAirport())
                && testFlight.containsKey(flight.getDepartureAirport())) {
                System.out.println("Flight available " + flight.getArrivalAirport());
            }
            else {
                throw new RouteNotFoundException();
            }


            if(flight.getDepartureAirport().equals(flight.getArrivalAirport())){
                throw new RouteNotFoundException();
            }

    }
}