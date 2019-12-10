package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> numbers) {

        ArrayList<Integer> numbersAfterExterminate = new ArrayList<>();

        for(int i=0; i<numbers.size()-1; i++) {

            int tempNumber = numbers.get(i);
            if(tempNumber % 2 == 0){
                numbersAfterExterminate.add(tempNumber);
            }

        }
        return numbersAfterExterminate;
    }


}
