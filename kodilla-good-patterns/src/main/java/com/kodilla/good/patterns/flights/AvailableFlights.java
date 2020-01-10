package com.kodilla.good.patterns.flights;

import java.time.LocalDateTime;

public class AvailableFlights {

    LocalDateTime timeFlight1;
    LocalDateTime timeFlight2;
    LocalDateTime timeFlight3;
    LocalDateTime timeFlight4;
    LocalDateTime timeFlight5;
    LocalDateTime timeFlight6;
    LocalDateTime timeFlight7;
    LocalDateTime timeFlight8;
    LocalDateTime timeFlight9;

    Flight flight1;
    Flight flight2;
    Flight flight3;
    Flight flight4;
    Flight flight5;
    Flight flight6;
    Flight flight7;
    Flight flight8;
    Flight flight9;

    public AvailableFlights() {
        timeFlight1 = LocalDateTime.of(2020,1,12,8,0);
        timeFlight2 = LocalDateTime.of(2020,1,12,10,0);
        timeFlight3 = LocalDateTime.of(2020,1,12,12,0);
        timeFlight4 = LocalDateTime.of(2020,1,13,8,0);
        timeFlight5 = LocalDateTime.of(2020,1,13,10,0);
        timeFlight6 = LocalDateTime.of(2020,1,13,12,0);
        timeFlight7 = LocalDateTime.of(2020,1,14,8,0);
        timeFlight8 = LocalDateTime.of(2020,1,14,10,0);
        timeFlight9 = LocalDateTime.of(2020,1,14,12,0);

        flight1 = new Flight("Gdańsk", "Kraków", "Wrocław", timeFlight1);
        flight2 = new Flight("Gdańsk", "Kraków", "Wrocław", timeFlight2);
        flight3 = new Flight("Gdańsk", "Kraków", "Wrocław", timeFlight3);
        flight4 = new Flight("Warszawa", "Poznań", "Szczecin", timeFlight4);
        flight5 = new Flight("Warszawa", "Poznań", "Szczecin", timeFlight5);
        flight6 = new Flight("Warszawa", "Poznań", "Szczecin", timeFlight6);
        flight7 = new Flight("Wrocław", "Warszawa", "Gdańsk", timeFlight7);
        flight8 = new Flight("Wrocław", "Warszawa", "Gdańsk", timeFlight1);
        flight9 = new Flight("Wrocław", "Warszawa", "Gdańsk", timeFlight1);
    }
}
