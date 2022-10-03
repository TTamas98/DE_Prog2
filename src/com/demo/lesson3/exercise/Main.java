package com.demo.lesson3.exercise;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student a = new Student("asd","asd","asd", 14);
        Student b = new Student("asd2","asd2","asd2", 16);
        Student c = new Student("asd3","asd3","asd3", 118);

        List<Student> studentSet = new ArrayList<>(Set.of(a,b,c));
        Collections.sort(studentSet, new StudentComparator());
        for(Student s: studentSet) {
            System.out.println(s.getName());
        }
    }
}
