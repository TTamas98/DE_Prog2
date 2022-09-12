package com.demo.lesson1;

public class Main {

    public static void main(String[] args) {

        // Primitives
        int number1 = 0;
        long number2 = 1L;
        double number3 = 3.0;
        float number4 = 4.0f;

        System.out.println(number1 + number2);
        System.out.println(number2 + number3);
        System.out.println(number3 + number4);

        Object result = number1 + number2;
        System.out.println(result.getClass().getSimpleName() + ": " + result);

        System.out.println("\n-------------------------------\n");

        // Strings
        String text = "          Hello There         ";
        String newText = new String("Hello There");

        System.out.println(text == newText);
        System.out.println(text.equals(newText));

        System.out.println(text.charAt(0));
        System.out.println(text.length());
        System.out.println(String.format("%d, %s, %c", 2, "epam", 'x')); // https://www.javatpoint.com/java-string-format
        System.out.println(text.substring(0,6));
        System.out.println(text.contains("e"));
        System.out.println(String.valueOf(234));
        System.out.println(text.replace("e","a"));
        System.out.println(text.split(" ")[0]); // Array
        System.out.println(text.indexOf("e"));
        System.out.println(text.trim());

        System.out.println("\n-------------------------------\n");

        // IF

        int a = 2;
        int b = 3;

        if(a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("a not equals b");
        }

        if(a < b) {
            System.out.println("a is less then b");
        } else if(a > b) {
            System.out.println("a is greater then b");
        } else if(a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("IMPOSSIBLE");
        }

        int c = (a > b) ? a : b;

        System.out.println("\n-------------------------------\n");

        // FOR
        String test = "Hello There";
        int[] testArray = {1,2,3,4,5,6,7,8,9,10,11};

        for(int i = 0; i < test.length(); i++) {
            System.out.print(test.charAt(i) + " ");
        }

        System.out.println();

        for(int i: testArray) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n-------------------------------\n");

        // WHILE

        int i = 0;
        while(i < testArray.length) {
            System.out.printf("%d ", i);
            i++;
        }

        System.out.println("\n-------------------------------\n");

        // SWITCH

        switch (a) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("Default");
        }

        System.out.println("\n-------------------------------\n");

        String exercise1 = "First Lesson";

        for(int j = 0; j < exercise1.length(); j++) {
            System.out.printf("%d. %c\n", j+1, exercise1.charAt(j));
        }

        String exercise2 = "I love salad so much.";
        String result2 = "";
        for(String s: exercise2.split(" ")) {
            if(s.contains("o")) {
                result2 = s;
                break;
            }
        }

        System.out.println(result2);

        int start = 0;
        int start2 = 1;

        while(start < 100) {
            start = start + start2;
            start2 = start + start2;
            System.out.println(start);
            System.out.println(start2);
        }
    }
}
