package com.demo.lesson7.generics;

import java.util.List;

public class Exercises {

    public <T extends Number> long count(List<T> numberList){
        long counter = 0;
        for(T number: numberList) {
            if(number.intValue() % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
