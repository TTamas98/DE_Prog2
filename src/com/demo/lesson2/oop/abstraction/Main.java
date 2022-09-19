package com.demo.lesson2.oop.abstraction;

public class Main {
    public static void main(String[] args) {
        GenericCalculator genericCalculator = new Calculator();
        System.out.println(genericCalculator.addition(1,2));
        System.out.println(genericCalculator.subtraction(1,2));
        System.out.println(genericCalculator.multiply(1,2));
    }
}
