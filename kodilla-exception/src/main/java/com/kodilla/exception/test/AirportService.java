package com.kodilla.exception.test;

import java.util.HashMap;


public class AirportService {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> testFlight = new HashMap<>();
        testFlight.put("Dublin", true);
        testFlight.put("Moscow", true);
        testFlight.put("Poznan", true);
        testFlight.put("Malta", true);

        try {
            if (testFlight.get(flight.getArrivalAirport())) {
                System.out.println("Flight available");
            } else {
                throw new RouteNotFoundException();
            }
        }
        catch(NullPointerException e) {
            System.out.println("Flight not found");
        }
        finally {
            System.out.println("End of search");
        }
    }



}
