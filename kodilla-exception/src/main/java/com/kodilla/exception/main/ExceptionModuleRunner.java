package com.kodilla.exception.main;

import com.kodilla.exception.io.FileReader;
import com.kodilla.exception.io.FileReaderException;
import com.kodilla.exception.test.MyException;
import com.kodilla.exception.test.ExceptionHandling;

public class ExceptionModuleRunner {

    public static void main(String [] args) {

        FileReader fileReader = new FileReader();

        try{
            fileReader.readFile();
        }
        catch(FileReaderException e){
            System.out.println("Problem while reading a file");
        }

        ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
            exceptionHandling.throwException();
        }
        catch(MyException e) {
            System.out.println("Unexpected numbers");

        }
    }





}
