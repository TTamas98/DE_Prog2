package com.demo.lesson3.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetAndMapExample {

    private Set<String> hashSetExample = new HashSet<>();
    private Set<String> hashSetExample2 = new HashSet<>(Set.of("Hello There", "Roger Roger", "Aslaug"));

    public void printHashSetExample() {
        for(String element: hashSetExample2) {
            System.out.println(element);
        }
    }

    public void addElementsToHashSetExample() {
        hashSetExample2.add(null);
    }

    private Set<String> linkedHashSetExample = new LinkedHashSet<>();
    private Set<String> linkedHashSetExample2 = new LinkedHashSet<>(Set.of("Hello There", "Roger Roger", "Aslaug"));

    public void printLinkedHashSetExample() {
        for(String element: linkedHashSetExample2) {
            System.out.println(element);
        }
    }
}
