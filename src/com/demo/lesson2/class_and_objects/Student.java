package com.demo.lesson2.class_and_objects;

public class Student {

    //State
    private String name;
    private String email;
    private int age;
    private int[] grades = new int[10];

    public Student(String name, String email, int age, int[] grades) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.grades = grades;
    }

    //Behavior
    public double calculateFinalGrade() {
        int sum = 0;
        for(int grade: grades) {
            sum += grade;
        }

        return (double) sum /10;
    }

}
