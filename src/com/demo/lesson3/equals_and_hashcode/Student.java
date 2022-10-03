package com.demo.lesson3.equals_and_hashcode;

import java.util.Objects;

public class Student {

    private String name;
    private String email;
    private String phoneNumber;
    private int age;
    private int height;
    private double weight;

    public Student(String name, String email, String phoneNumber, int age, int height, double weight) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student that = (Student) o;
        return age == that.age && height == that.height && Double.compare(that.weight, weight) == 0 && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, phoneNumber, age, height, weight);
    }
}
