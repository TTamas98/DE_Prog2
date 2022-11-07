package com.demo.lesson8.solution;

import java.util.Objects;

public abstract class Hero {
    private final String name;
    private final int age;
    private final String nickname;
    private final boolean isGood;

    public Hero(String name, Integer age, String nickname, boolean isGood) {
        this.name = name;
        this.nickname = nickname;
        this.age = this.validateAge(age);
        this.isGood = isGood;
    }

    private Integer validateAge(Integer age) {
        if(age > 1000 || age == null) {
            throw new IllegalArgumentException();
        } else {
            return age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getNickname() {
        return nickname;
    }

    public boolean isGood() {
        return isGood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hero hero = (Hero) o;
        return age == hero.age && isGood == hero.isGood && Objects.equals(name, hero.name) && Objects.equals(nickname, hero.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, nickname, isGood);
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Nickname: %s, Side: %s",
                name,
                age,
                nickname== null ? "None" : nickname,
                isGood ? "Hero" : "Evil");
    }
}
