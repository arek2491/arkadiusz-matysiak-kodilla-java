package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BigmacTestSuite {

    @Test
    public void testNewBigmac() {

        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun without sezam")
                .burgers(2)
                .ingredient("cheese")
                .sauce("barbecue")
                .ingredient("chili")
                .ingredient("onion")
                .ingredient("cucumber")
                .build();

        int numOfIngredients = bigmac.getIngredients().size();
        List<String> ingradientsTestList = new ArrayList<>();
        ingradientsTestList.add("cheese");
        ingradientsTestList.add("chili");
        ingradientsTestList.add("onion");
        ingradientsTestList.add("cucumber");

        Assert.assertEquals(4, numOfIngredients);
        Assert.assertEquals("bun without sezam", bigmac.getBun());
        Assert.assertEquals(2, bigmac.getBurgers());
        Assert.assertEquals("barbecue", bigmac.getSauce());
        Assert.assertEquals(ingradientsTestList, bigmac.getIngredients());
    }
}
