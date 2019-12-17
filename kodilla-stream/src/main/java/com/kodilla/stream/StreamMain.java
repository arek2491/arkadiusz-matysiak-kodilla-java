package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;


public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("This is a beautiful text" , text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("I don't know if it's a good solution" , String::toUpperCase);
        poemBeautifier.beautify("My beautifier " , text -> "*** " + text + "***");
        poemBeautifier.beautify("This is the last text" , text -> "~~~" + text + "~~~");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }


}