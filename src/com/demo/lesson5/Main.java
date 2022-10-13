package com.demo.lesson5;

import com.demo.lesson4.console.exercise.ExerciseSolution;
import com.demo.lesson5.hero.DpsHero;
import com.demo.lesson5.hero.Hero;
import com.demo.lesson5.hero.TankHero;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ExerciseSolutions exerciseSolution = new ExerciseSolutions();
        System.out.println(exerciseSolution.isPalindrome("asafapa"));
        System.out.println(exerciseSolution.switchLetters("asfsagag"));

        Hero hero = new Hero("asd",12,"male", List.of("asfasga"));
        Hero hero2 = new DpsHero("asd",12,"male", List.of("asfasga"), 123);
        Hero hero3 = new TankHero("asd2",18,"male", List.of("asfasga"), 123);

        exerciseSolution.battle(hero2, hero3);
    }
}
