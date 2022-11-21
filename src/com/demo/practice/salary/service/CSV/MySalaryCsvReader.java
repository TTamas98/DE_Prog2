package com.demo.practice.salary.service.CSV;

import com.demo.lesson4.exercises.ford_escort.Ford;
import com.demo.practice.salary.domain.SalaryInformation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySalaryCsvReader implements SalaryCsvReader {
    @Override
    public List<SalaryInformation> readSalariesFromCSV() {
        List<SalaryInformation> result = new ArrayList<>();
        File file = new File("C:\\DE\\Code\\Lessons\\src\\com\\demo\\practice\\salary\\resources\\Employee_Salaries_-_2020.csv");
        try(Scanner scanner = new Scanner(file)){
            if(scanner.hasNext()){
                scanner.nextLine();
            }
            while(scanner.hasNext()) {
                result.add(convertToSalaryInformation(scanner.nextLine()));
            }
        } catch (IOException | RuntimeException e) {
            System.err.println(e.getMessage());
        }
        return result;
    }

    private SalaryInformation convertToSalaryInformation(String line) {
        String[] elements = line.split(",");
        String department = elements[0] == null ? "" : elements[0];
        String departmentName = elements[1] == null ? "" : elements[1];
        String division = elements[2] == null ? "" : elements[2];

        if(division.startsWith("\"")) {
            int counter = 3;
            while(!elements[counter].endsWith("\"")) {
                division += elements[counter];
                counter++;
            }
            division += elements[counter++];
            char gender = elements[counter] == null ? 'N' : elements[counter].charAt(0);
            counter += 1;
            Double salary = elements[counter] == null ? 0L : Double.parseDouble(elements[counter]);
            counter += 1;
            String rating = elements[counter] == null ? "" : elements[counter];
            return new SalaryInformation(department, departmentName, division, gender, salary, rating);
        }else {
            char gender = elements[3] == null ? 'N' : elements[3].charAt(0);
            Double salary = elements[4] == null ? 0L : Double.parseDouble(elements[4]);
            String rating = elements[5] == null ? "" : elements[5];
            return new SalaryInformation(department, departmentName, division, gender, salary, rating);
        }
    }

    @Override
    public void writeSalaryInformationToFile(List<SalaryInformation> salaryInformationList) {

    }

    @Override
    public void writeSalaryInformationToFile(SalaryInformation salaryInformation) {

    }
}
