package com.demo.lesson3.equals_and_hashcode;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("test","test","test",21,170,65.3);
        Student b = new Student("test","test","test",21,170,65.3);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(a);
        studentSet.add(b);

        for(Student student: studentSet) {
            System.out.println(student.getName());
        }
    }
}
