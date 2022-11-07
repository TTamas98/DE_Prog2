package com.demo.lesson8;

public class Animal {
    private String name;
    private AnimalType animalType;

    public boolean isBird() {
        return AnimalType.MADAR == this.animalType;
    }
}
