package com.kodilla.spring.calculator;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double addResult = calculator.add(2,2);
        Assert.assertEquals(4, addResult, 0);

        double subResult = calculator.sub(2, 2);
        Assert.assertEquals(0 , subResult, 0);

        double mulResult = calculator.mul(2, 2);
        Assert.assertEquals(4 , mulResult, 0);

        double divResult = calculator.div(2, 2);
        Assert.assertEquals(1 , divResult, 0);


    }
}
