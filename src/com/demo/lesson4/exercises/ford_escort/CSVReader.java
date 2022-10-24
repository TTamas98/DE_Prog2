package com.demo.lesson4.exercises.ford_escort;

import com.demo.lesson4.exercises.biostats.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVReader {
    public List<Ford> readFordsFromCSV() {
        List<Ford> result = new ArrayList<>();
        File file = new File("C:\\DE\\Code\\Lessons\\src\\com\\demo\\lesson4\\exercises\\ford_escort\\ford_escort.csv");
        try(Scanner scanner = new Scanner(file)){
            if(scanner.hasNext()){
                scanner.nextLine();
            }
            while(scanner.hasNext()) {
                result.add(convertToFord(scanner.nextLine()));
            }
        }catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
            return result;
    }


    private Ford convertToFord(String line) {
        String[] fields = line.split(",\\s+");
        try {
            int year = Integer.parseInt(fields[0]);
            int milage = Integer.parseInt(fields[1]);
            long price = Long.parseLong(fields[2]);
            return new Ford(year,milage, price);
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
        return new Ford(0,0,0);
    }
}
