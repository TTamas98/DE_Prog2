package com.demo.lesson4.exercises.biostats;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CSVReader csvReader = new CSVReader();
        csvReader.printPersons();
    }
}
