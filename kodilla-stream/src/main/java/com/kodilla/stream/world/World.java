package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public final class World {

    private final List<Continent> continentList;

    public World() {

        continentList = new ArrayList<>();
        Continent europe = new Continent();
        Continent asia = new Continent();
        Continent africa = new Continent();
        Continent southAmerica = new Continent();
        Continent northAmerica = new Continent();

        europe.addCountry(new Country("country4" , new BigDecimal("11111111111111111")));
        europe.addCountry(new Country("country1" , new BigDecimal("11111111111111111")));
        europe.addCountry(new Country("country2" , new BigDecimal("11111111111111111")));
        asia.addCountry(new Country( "country3" ,  new BigDecimal("11111111111111111")));
        asia.addCountry(new Country( "country5" ,  new BigDecimal("11111111111111111")));
        asia.addCountry(new Country( "country6" ,  new BigDecimal("11111111111111111")));
        africa.addCountry(new Country( "country7" ,  new BigDecimal("11111111111111111")));
        africa.addCountry(new Country( "country8" ,  new BigDecimal("11111111111111111")));
        africa.addCountry(new Country( "country9" ,  new BigDecimal("11111111111111111")));
        southAmerica.addCountry(new Country( "country10" ,  new BigDecimal("11111111111111111")));
        southAmerica.addCountry(new Country( "country11" ,  new BigDecimal("11111111111111111")));
        southAmerica.addCountry(new Country( "country12" ,  new BigDecimal("11111111111111111")));
        northAmerica.addCountry(new Country( "country13" ,  new BigDecimal("11111111111111111")));
        northAmerica.addCountry(new Country( "country14" ,  new BigDecimal("11111111111111111")));
        northAmerica.addCountry(new Country( "country14" ,  new BigDecimal("11111111111111111")));


        continentList.add(europe);
        continentList.add(asia);
        continentList.add(africa);
        continentList.add(southAmerica);
        continentList.add(northAmerica);


    }
    public BigDecimal getPeopleQuantity() {
        return continentList.stream()
                .flatMap(country -> country.getCountry().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

    }
}
