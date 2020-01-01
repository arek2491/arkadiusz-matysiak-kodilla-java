package com.kodilla.exception.test;

import com.kodilla.exception.io.MyException;

public class ExceptionHandling  {

    public void throwException() throws MyException {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(4, 1);
        }
        catch(Exception e) {
            throw new MyException();
        }
        finally{
            System.out.println("End of the program...");
        }

    }

}
