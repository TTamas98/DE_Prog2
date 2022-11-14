package com.demo.lesson10.domain;

public class User {

    //Fields
    int age;
    String name;

    // Visibility modifier + Type + name [+ value]
    private String email;

    // Use final in case of constants or variable you do not want to change
    private final String password = "cannot be modified";

    // Constructor: Special method to create instance of a class.
    // You can create it with any parameters you want.
    // But you have to add the final fields as a parameters.
    public User(int age, String name, String email) {
        this.age = age;
        this.name = name;
        this.email = email;
    }

    public User() {
    }

    // By default, every class is a child class of the OBJECT class.
    // Important object methods: equals, hashcode, toString.

}
