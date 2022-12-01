package com.demo.lesson10;

import java.util.ArrayList;
import java.util.List;

public class LoopsAndStatements {
    public static void main(String[] args) {

        // IF
        if(1 == 2){
            // true
        } else {
            // false
        }

        // ELSE IF
        if(1 == 2){
            // true ( 1 = 2 )
        } else if (2 == 2) {
            // true ( 2 = 2 )
        } else {
            // every condition before is false
        }

        // SWITCH
        switch(3) {
            case 1:
                // in case the given value is 1
            case 2:
                // in case the given value is 2
            case 3:
                // in case the given value is 3
            default:
                // in case the given value does not match any case before.

                //Use break or return in cases.
        }

        // LOOPS

        // FOR Loop: In case we know how many times a loop should run
        for(int i = 0; i < 10; i++) {
            // do something 10 times
        }

        // FOR Each loop: Use to iterate through a collection or array
        List<Integer> numberList = new ArrayList<>();
        for(int number: numberList) {
            // do something with every element of the list.
        }

        // WHILE
        int counter = 0;
        while(counter < 10) {
            // does something till the given condition is not fulfilled.
        }

        // DO WHILE
        do {
            // does something till the given condition is not fulfilled.
        } while(counter < 10); // Checks the condition afterwards.
    }
}
