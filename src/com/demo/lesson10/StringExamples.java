package com.demo.lesson10;

public class StringExamples {
    public static void main(String[] args) {
        String epam = "Epam";
        epam.length();
        epam.toCharArray();
        epam.contains("e");
        epam.split("a");
        epam.toLowerCase();
        epam.toUpperCase();
        epam.indexOf('e');

        // Method chaining
        epam.toUpperCase().indexOf("P");

        // Use StringBuilder in case of constantly changing String.
        StringBuilder sb = new StringBuilder("initial");
        sb.append("test");
        sb.reverse();
        sb.replace(1, 3, "asd");
        sb.delete(5,8);
        sb.toString();
    }
}
