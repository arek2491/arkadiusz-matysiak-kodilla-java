package com.kodilla.stream.world;
import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        World world = new World();
        BigDecimal expectedQuantity = new BigDecimal("166666666666666665");
        System.out.println("World population: " + world.getPeopleQuantity());
        Assert.assertEquals(expectedQuantity , world.getPeopleQuantity());

    }


}
