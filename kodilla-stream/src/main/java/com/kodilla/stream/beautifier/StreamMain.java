package com.kodilla.stream.beautifier;

public class StreamMain {

    public static void main(String [] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("This is a beautiful text", text -> "ABC " + text + " ABC");
        poemBeautifier.beautify("This is a next one text", String::toUpperCase);
        poemBeautifier.beautify("Whis is a wonderful text", text -> "*** " + text + " ***");
        poemBeautifier.beautify("This is the last one text" , text -> "~~~ " + text + "~~~");


    }
}
