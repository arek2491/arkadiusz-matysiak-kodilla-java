package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class MostExpensivePizzaWithAllIngredients extends AbstractPizzaOrderDecorator {
    public MostExpensivePizzaWithAllIngredients(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(100));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", all what you need";
    }
}
