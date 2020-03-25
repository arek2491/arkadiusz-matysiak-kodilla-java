package com.kodilla.patterns2.decorator.pizza;

import com.kodilla.patterns2.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public abstract class AbstractPizzaOrderDecorator implements Pizza {
    private final Pizza pizza;

    protected AbstractPizzaOrderDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public BigDecimal getCost() {
        return pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

}
