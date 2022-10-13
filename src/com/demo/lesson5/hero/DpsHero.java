package com.demo.lesson5.hero;

import com.demo.lesson5.ExerciseSolutions;

import java.util.List;

public class DpsHero extends Hero {

    private final int dmgPerSecond;

    public DpsHero(String name, int age, String gender, List<String> skillList,int dmgPerSecond) {
        super(name, age, gender, skillList);
        this.dmgPerSecond = dmgPerSecond;
    }

    public int getDmgPerSecond() {
        return dmgPerSecond;
    }
}
