package com.demo.lesson4.exercises.ford_escort;

import com.demo.lesson4.exercises.biostats.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
    public List<Ford> readFordsFromCSV() throws FileNotFoundException {
        List<Ford> result = new ArrayList<>();
        File file = new File("C:\\DE\\Code\\Lessons\\src\\com\\demo\\lesson4\\exercises\\ford_escort\\ford_escort.csv");
        Scanner scanner = new Scanner(file);

        if(scanner.hasNext()){
            scanner.nextLine();
        }

        while(scanner.hasNext()) {
            result.add(convertToFord(scanner.nextLine()));
        }

        return result;
    }


    private Ford convertToFord(String line) {
        String[] fields = line.split(",\\s+");
        return new Ford(Integer.parseInt(fields[0]),Integer.parseInt(fields[1]),Long.parseLong(fields[2]));
    }
}
