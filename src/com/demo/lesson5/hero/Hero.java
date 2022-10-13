package com.demo.lesson5.hero;

import java.util.Arrays;
import java.util.List;

public class Hero implements Comparable<Hero> {

    private final String name;
    private final int age;
    private final String gender;
    protected final List<String> skillList;

    public Hero(String name, int age, String gender, List<String> skillList) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.skillList = skillList;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getSkillList() {
        return List.copyOf(skillList);
    }

    @Override
    public int compareTo(Hero o) {
        return this.age - o.getAge();
    }
}
