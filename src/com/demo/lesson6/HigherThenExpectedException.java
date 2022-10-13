package com.demo.lesson6;

public class HigherThenExpectedException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Your number cannot be bigger then 10";
    }
}
