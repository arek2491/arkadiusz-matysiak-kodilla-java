package com.kodilla.good.patterns.flights;

import java.util.List;
import java.util.Scanner;

public class SearchFlightProcessor {

   private SearchFlight searchFlight;

   public SearchFlightProcessor(SearchFlight searchFlight) {
       this.searchFlight = searchFlight;
   }

   public List<Flight> process() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Podaj nazwę miasta: ");
       String cityName = scanner.nextLine();

       return this.searchFlight.search(cityName);
   }
}
