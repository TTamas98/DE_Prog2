package com.demo.lesson4.exercises.ford_escort;

import com.demo.lesson4.exercises.ford_escort.CSVReader;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private final List<Ford> fordList;

    public Solution() throws FileNotFoundException {
        CSVReader csvReader = new CSVReader();
        fordList = csvReader.readFordsFromCSV();
    }

    public List<Ford> getCarsFromYear(int year) {
        List<Ford> result = new ArrayList<>();

        for(Ford ford: fordList) {
            if(ford.getYear() == year) {
                result.add(ford);
            }
        }

        return result;
    }

    public List<Ford> getCarsBetweenMilageRange(int from, int to) {
        List<Ford> result = new ArrayList<>();

        for(Ford ford: fordList) {
            if(ford.getMilage() >= from && ford.getMilage() <= to) {
                result.add(ford);
            }
        }

        return result;
    }

    public List<Ford> getCarsWithLessPrice(long price) {
        List<Ford> result = new ArrayList<>();

        for(Ford ford: fordList) {
            if(ford.getPrice() < price) {
                result.add(ford);
            }
        }

        return result;
    }
}
