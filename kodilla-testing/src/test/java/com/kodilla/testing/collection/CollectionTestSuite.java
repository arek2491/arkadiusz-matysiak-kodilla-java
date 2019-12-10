package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;

public class CollectionTestSuite {

    @Before
    public void before(){
        System.out.println("Test Case: begin");
    }
    @After
    public void after(){
        System.out.println("Test Case: end");
    }
    @Test
    public void testOddNumbersExterminatorEmptyList(){

        ArrayList<Integer> testNumbers = new ArrayList<>();
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Testing: " + oddNumbersExterminator.exterminate(testNumbers));
        Assert.assertEquals(testNumbers, oddNumbersExterminator.exterminate(testNumbers));

    }
    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> testNumbers = new ArrayList<>();
        for (int i = 1; i < 50; i++) {
            testNumbers.add(i);
        }
        ArrayList<Integer> expectedResult = new ArrayList<>();
        for (int i = 2; i < 50; i += 2) {
            expectedResult.add(i);
        }
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenList = oddNumbersExterminator.exterminate(testNumbers);
        System.out.println("Testing " + evenList);
        Assert.assertEquals(expectedResult, evenList);


    }
}
