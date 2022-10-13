package com.demo.lesson6;

import java.util.Scanner;

public class ExceptionExamples {

    public long sumUserInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        long sum = 0;
        while (!input.equals("q")) {
            int userInput = 0;
            try {
                userInput = Integer.parseInt(input);
                sum += userInput;
            } catch (NumberFormatException e) {
                System.out.println("Give a valid number!!!");
            } finally {
                input = scanner.nextLine();
            }
        }

        return sum;
    }

    public long sumUserInputNotHigherThenTen() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        long sum = 0;
        while (!input.equals("q")) {
            int userInput = 0;
            try {
                userInput = Integer.parseInt(input);
                if(userInput > 10) {
                    throw new HigherThenExpectedException();
                }
                sum += userInput;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            } catch (HigherThenExpectedException e) {
                System.out.println(e.getMessage());
            }
            finally {
                input = scanner.nextLine();
            }
        }

        return sum;
    }
}
