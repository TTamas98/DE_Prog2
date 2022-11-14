package com.demo.lesson10;

import com.demo.lesson10.domain.User;

// Give meaningful names to classes and variables (noun)
public class Declartions {

    // Primitives
    int a = 2;
    long b = 3l;
    double c = 2.0;
    float d = 3.5f;
    byte e = 1;
    char f = 's';
    short s = 0;
    boolean bool = false;

    // Objects
    String g;
    Integer i;
    Long l;
    Double dd;
    Float ff;
    Byte bb;
    Character cc;
    Short ss;
    Boolean boolea;

    //Custom objects
    User user = new User();

    //Method declaration
    // visibility modifier + return type(primitive or object) + name(verb) + parameters + body
    // Use the final keyword to make method unmodifiable(cannot be override)
    private void getDeclaration() {}
}
