package com.kodilla.stream.array;


import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
import java.util.stream.IntStream;
;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){

        int [] exampleNumbers = new int [20];
        IntStream.range(0 , exampleNumbers.length)
                .forEach(i -> exampleNumbers[i] = i + 10);

        double sumOfNumbers = IntStream.range(0 , exampleNumbers.length)
                .map(i -> exampleNumbers[i] = i + 10)
                .sum();


        double testAverage = sumOfNumbers/exampleNumbers.length;

        Assert.assertEquals(testAverage , ArrayOperations.getAverage(exampleNumbers),0);


    }
}
