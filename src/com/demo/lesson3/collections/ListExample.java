package com.demo.lesson3.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    private List<String> arrayListExample = new ArrayList<>();
    private final List<String> arrayListExample2 = new ArrayList<>(List.of("Hello there", "General Kenobi", "Darth Jar Jar"));

    public void printArrayListExample() {
        for(String element: arrayListExample2) {
            System.out.println(element);
        }
    }

    private final List<String> linkedListExample = new LinkedList<>();
    private final List<String> linkedListExample2 = new LinkedList<>(List.of("Hello there", "General Kenobi", "Darth Jar Jar"));

    public void printLinkedListExample() {
        for(String element: linkedListExample) {
            System.out.println(element);
        }
    }

    public void printLinkedListExample2() {
        for(String element: linkedListExample2) {
            System.out.println(element);
        }
    }

    public void addElementsToLinkedList() {
        linkedListExample.add("Hello There");
        linkedListExample.add("General Kenobi");
        linkedListExample.add("Roger Roger");
        linkedListExample.add(null);
    }

    public List<String> getLinkedListExample() {
        return linkedListExample;
    }
}
