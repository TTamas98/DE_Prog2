package com.demo.lesson2.oop.inheritance;

public class Car extends Vehicle {

    private String motorType;

    @Override
    public String honk() {
        return "Honk";
    }
}
