package com.demo.lesson5.hero;

import java.util.List;

public class SupportHero extends Hero {

    private final int healPerSecond;

    public SupportHero(String name, int age, String gender, List<String> skillList, int healPerSecond) {
        super(name, age, gender, skillList);
        this.healPerSecond = healPerSecond;
    }

    public int getHealPerSecond() {
        return healPerSecond;
    }
}
