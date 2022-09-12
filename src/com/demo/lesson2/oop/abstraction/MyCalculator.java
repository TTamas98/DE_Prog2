package com.demo.lesson2.oop.abstraction;

public class MyCalculator implements GenericCalculator {
    @Override
    public int addition(int x, int y) {
        return 1;
    }

    @Override
    public int multiply(int x, int y) {
        return 2;
    }

    @Override
    public int subtraction(int x, int y) {
        return 3;
    }
}
