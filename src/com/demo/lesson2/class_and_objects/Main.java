package com.demo.lesson2.class_and_objects;

public class Main {
    public static void main(String[] args) {
        String name = "Test Elek";
        String email = "test.elek@mail.com";
        int age = 21;
        int[] grades = { 2, 4, 5, 5, 5, 3, 1, 4, 4, 3};
        Student student = new Student(name, email, age, grades);
        System.out.println(student.calculateFinalGrade());
    }
}
