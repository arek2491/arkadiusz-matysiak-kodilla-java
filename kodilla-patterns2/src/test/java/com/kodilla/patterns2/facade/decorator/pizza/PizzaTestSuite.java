package com.kodilla.patterns2.facade.decorator.pizza;

import com.kodilla.patterns2.decorator.pizza.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaTestSuite {
    @Test
    public void testPizzaOrderGetCost() {
        Pizza pizza = new PizzaOrder();
        BigDecimal price = pizza.getCost();
        Assert.assertEquals(new BigDecimal(15), price);
    }

    @Test
    public void testPizzaOrderGetDescription() {
        Pizza pizza = new PizzaOrder();
        String description = pizza.getDescription();
        Assert.assertEquals("Ingredients: tomato sauce, cheese", description);
    }

    @Test
    public void testPizzaCappriciosaGetCost() {
        Pizza pizza = new PizzaOrder();
        pizza = new PizzaCappriciosa(pizza);
        BigDecimal price = pizza.getCost();
        Assert.assertEquals(new BigDecimal(25), price);
    }

    @Test
    public void testPizzaCappriciosaGetDescription() {
        Pizza pizza = new PizzaOrder();
        pizza = new PizzaCappriciosa(pizza);
        String description = pizza.getDescription();
        Assert.assertEquals("Ingredients: tomato sauce, cheese, ham", description);
    }

    @Test
    public void testPizzaSalamiGetCost() {
        Pizza pizza = new PizzaOrder();
        pizza = new PizzaCappriciosa(pizza);
        pizza = new PizzaSalami(pizza);
        BigDecimal price = pizza.getCost();
        Assert.assertEquals(new BigDecimal(35), price);
    }

    @Test
    public void testPizzaSalamiGetDescription() {
        Pizza pizza = new PizzaOrder();
        pizza = new PizzaCappriciosa(pizza);
        pizza = new PizzaSalami(pizza);
        String description = pizza.getDescription();
        Assert.assertEquals("Ingredients: tomato sauce, cheese, ham, salami", description);
    }

    @Test
    public void testPizzaWithAllIngredientsGetCost() {
        Pizza pizza = new PizzaOrder();
        pizza = new PizzaCappriciosa(pizza);
        pizza = new PizzaSalami(pizza);
        pizza = new MostExpensivePizzaWithAllIngredients(pizza);
        BigDecimal price = pizza.getCost();
        Assert.assertEquals(new BigDecimal(135), price);
    }

    @Test
    public void testPizzaWithAllIngredientsGetDescription() {
        Pizza pizza = new PizzaOrder();
        pizza = new PizzaCappriciosa(pizza);
        pizza = new PizzaSalami(pizza);
        pizza = new MostExpensivePizzaWithAllIngredients(pizza);
        String description = pizza.getDescription();
        Assert.assertEquals("Ingredients: tomato sauce, cheese, ham, salami, all what you need", description);
    }

}
