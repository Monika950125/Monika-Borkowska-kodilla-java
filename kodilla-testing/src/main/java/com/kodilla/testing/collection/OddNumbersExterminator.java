package com.kodilla.testing.collection;

import java.util.List;

public class OddNumbersExterminator {

    public void completeList(List<Integer> numbers) {
        for (int i = 0; i < 100; i++) {
            numbers.add(i);
        }
    }

    public void exterminate(List<Integer> numbers, List<Integer> evenNumbers){

        for(Integer number: numbers) {
           if (number % 2 == 0){
               evenNumbers.add(number);
           }

        }

    }

}
