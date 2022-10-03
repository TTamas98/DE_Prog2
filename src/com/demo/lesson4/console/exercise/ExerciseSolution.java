package com.demo.lesson4.console.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExerciseSolution {

    private final Scanner scanner = new Scanner(System.in);

    public void sortUserNumbers() {
        List<Long> inputList = readNumbersFromTheUser();
        Collections.sort(inputList);
        printResult(inputList);
    }

    private List<Long> readNumbersFromTheUser() {
        List<Long> inputList = new ArrayList<>();
        String input = scanner.nextLine();
        while(!input.equals("q")) {
            inputList.add(Long.parseLong(input));
            input = scanner.nextLine();
        }

        return inputList;
    }

    private void printResult(List<Long> result) {
        for(long number: result) {
            System.out.printf("%s, ",number);
        }
    }
}
