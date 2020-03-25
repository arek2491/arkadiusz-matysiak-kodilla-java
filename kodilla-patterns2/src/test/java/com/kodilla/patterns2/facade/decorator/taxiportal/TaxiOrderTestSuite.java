package com.kodilla.patterns2.facade.decorator.taxiportal;

import com.kodilla.patterns2.decorator.taxiportal.BasicTaxiOrder;
import com.kodilla.patterns2.decorator.taxiportal.TaxiNetworkOrderDecorator;
import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {
    @Test
    public void testBasicTaxiOrderGetCost() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        BigDecimal calculateCost = taxiOrder.getCost();
        Assert.assertEquals(new BigDecimal(5), calculateCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        TaxiOrder taxiOrder = new BasicTaxiOrder();
        String description = taxiOrder.getDescription();
        Assert.assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        BigDecimal theCost = theOrder.getCost();
        Assert.assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiOrderNetworkGetDescription() {
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        String description = theOrder.getDescription();
        Assert.assertEquals("Drive a course by Taxi Network", description);
    }
}
