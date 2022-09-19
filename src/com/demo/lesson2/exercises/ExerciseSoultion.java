package com.demo.lesson2.exercises;

public class ExerciseSoultion implements ExerciseService {

    @Override
    public void printFrom1To100() {
        for(int i = 1; i < 101;i++) {
            System.out.println(i);
        }
    }

    @Override
    public void fizzBuzz() {
        for (int i = 1; i < 101; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                System.out.println("FIZZBUZZ");
            }
            else if(i % 5 == 0) {
                System.out.println("BUZZ");
            }
            else if(i % 3 == 0) {
                System.out.println("FIZZ");
            }
            else {
                System.out.println(i);
            }
        }
    }

    @Override
    public boolean isPrime() {
        int number = 101;
        for(int i = 2; i < number / 2;i++) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void fibo() {
        int start = 0;
        int start2 = 1;

        while(start < 100) {
            start = start + start2;
            start2 = start + start2;
            System.out.println(start);
            System.out.println(start2);
        }
    }

    @Override
    public void gcd() {
        int a = 100;
        int b = 50;
        int result = 0;
        for(int i = 1;i <= b; i++) {
            if(b % i == 0 && a % i == 0) {
                result = i;
            }
        }

        System.out.println(result);
    }

    @Override
    public boolean isPalindrome() {
        String test = "TopSpoT";
        StringBuilder reverse = new StringBuilder("");
        for(int i = test.length() -1; i >= 0; i--) {
            reverse.append(test.charAt(i));
        }
        return reverse.toString().equals(test);
    }

    @Override
    public String getSubstring() {
        String test = "Test lm";
        int indexOfA = test.indexOf("a");
        if(indexOfA == -1) {
            return "";
        }
        return indexOfA > test.length() - 4 ? test.substring(indexOfA) : test.substring(indexOfA, indexOfA + 4);
    }


}
