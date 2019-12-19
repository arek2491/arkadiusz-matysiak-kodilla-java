package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class Continent {

   private final List<Country> countryList;


   public Continent(){

        countryList = new ArrayList<>();
   }

   public void addCountry(Country country) {
       countryList.add(country);
   }

   public List<Country> getCountry() {

       return countryList;
    }


}
