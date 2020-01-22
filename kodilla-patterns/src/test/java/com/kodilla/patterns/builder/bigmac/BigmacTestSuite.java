package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Bun without sezam")
                .burgers(2)
                .ingredient("cheese")
                .sauce("barbecue")
                .ingredient("chili")
                .ingredient("onion")
                .ingredient("cucumber")
                .build();

        int numOfIngredients = bigmac.getIngredients().size();
        Assert.assertEquals(4, numOfIngredients);
    }
}
