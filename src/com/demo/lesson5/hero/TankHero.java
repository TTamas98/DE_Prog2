package com.demo.lesson5.hero;

import java.util.List;

public class TankHero extends Hero {

    private final int shield;

    public TankHero(String name, int age, String gender, List<String> skillList, int shield) {
        super(name, age, gender, skillList);
        this.shield = shield;
    }

    public int getShield() {
        return shield;
    }
}
