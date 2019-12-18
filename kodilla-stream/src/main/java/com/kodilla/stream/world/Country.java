package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country implements PeopleQuantity {

    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("3333333");
        return peopleQuantity;
    }
}
