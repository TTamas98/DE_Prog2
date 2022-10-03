package com.demo.lesson4.exercises.biostats;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {

    public void printPersons() throws FileNotFoundException {
        List<Person> personList = readPersonsFromCSV();

        for(Person person: personList) {
            System.out.println(person);
        }
    }

    private List<Person> readPersonsFromCSV() throws FileNotFoundException {
        List<Person> result = new ArrayList<>();
        File file = new File("C:\\DE\\Code\\Lessons\\src\\com\\demo\\lesson4\\exercises\\biostats.csv");
        Scanner scanner = new Scanner(file);

        scanner.useDelimiter("\n");
        if(scanner.hasNext()){
            scanner.nextLine();
        }

        while(scanner.hasNext()) {
            result.add(convertToPerson(scanner.nextLine()));
        }

        return result;
    }


    private Person convertToPerson(String line) {
        String[] fields = line.split(",\\s+");
        Person person = new Person();
        person.setName(fields[0].substring(1,fields[0].length()-1));
        person.setSex(fields[1].substring(1,fields[1].length()-1));
        person.setAge(Integer.parseInt(fields[2]));
        person.setHeight(Integer.parseInt(fields[3]));
        person.setWeight(Integer.parseInt(fields[4]));
        return person;
    }
}
