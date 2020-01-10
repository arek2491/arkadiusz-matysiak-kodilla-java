package com.kodilla.good.patterns.flights;

import java.util.Scanner;

public class SearchExecutor {

    private Scanner scanner;

    public SearchExecutor() {
        scanner = new Scanner(System.in);
    }

    public void search() {
        SearchFlight searchFlight = new SearchFlight();
        System.out.println("Podaj miasto: ");
        String cityName = scanner.nextLine();
        System.out.println("Loty z " + cityName + ": ");
        searchFlight.searchByStartCity(cityName);
        System.out.println("Loty przez " + cityName + ": ");
        searchFlight.searchByThroughCity(cityName);
        System.out.println("Loty do: " + cityName + ": ");
        searchFlight.searchByLandingCity(cityName);
    }
}
