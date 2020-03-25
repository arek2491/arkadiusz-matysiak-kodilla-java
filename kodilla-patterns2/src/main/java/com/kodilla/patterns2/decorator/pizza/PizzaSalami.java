package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PizzaSalami extends AbstractPizzaOrderDecorator {
    public PizzaSalami(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(10));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", salami";
    }
}
