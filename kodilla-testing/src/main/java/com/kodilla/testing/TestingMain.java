package com.kodilla.testing;


import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        SimpleUser simpleUser = new SimpleUser("theForumUser");
        String result=simpleUser.getUsername();
        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        }
        else {
            System.out.println("Error");
        }

        System.out.println("Calculator Test: ");
        System.out.println("Add test: ");
        Calculator calculator = new Calculator();
        int result1 = calculator.add(10,15);
        if(result1 == 25) {
            System.out.println("test OK");
        }
        else{
            System.out.println("Error");
        }

        System.out.println("Subtract test: ");
        int result2 = calculator.subtract(20,18);
        if(result2 == 2){
            System.out.println("test OK");
        }
        else{
            System.out.println("Error");
        }


    }
}
