package com.demo.lesson5;

import com.demo.lesson5.hero.Hero;

import java.util.ArrayList;
import java.util.List;

public class ExerciseSolutions {

    public boolean isPalindrome(String word) {
        StringBuilder sb = new StringBuilder();
        char[] characters = word.toCharArray();

        for(int i = characters.length - 1; i >= 0;i--) {
            sb.append(characters[i]);
        }

        return sb.toString().equals(word);
    }

    public double calculate(char operator, int x, int y) {
        switch (operator) {
            case '+':
                return x+y;
            case '-':
                return x-y;
            case '/':
                return x/y;
            case '*':
                return x*y;
        }
        return -1;
    }

    public int countE(){
        String elementalHero = "elemental hero";
        char[] characters = elementalHero.toCharArray();
        int count = 0;
        for(char c: characters)
            if(c == 'e') {
                count++;
            }
        return count;
    }

    public String switchLetters(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = word.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            if ((i + 1) % 2 == 0) {
                stringBuilder.append(String.valueOf(chars[i]).toUpperCase());
            } else {
                stringBuilder.append(chars[i]);
            }
        }

        return stringBuilder.toString();
    }

    public String longestWord(List<String> wordList) {
        String longestWord = wordList.get(0);
        for(String word: wordList) {
            longestWord = longestWord.length() < word.length()
                    ? word
                    : longestWord;
        }

        return longestWord;
    }

    public long sumNumbers(List<Integer> numberList) {
        long sum = 0;

        for(int number : numberList) {
            sum += number;
        }

        return sum;
    }

    public List<Integer> filterNumbers(List<Integer> numberList,int filter) {
        List<Integer> result = new ArrayList<>();

        for(int number : numberList) {
            if(number > filter) {
                result.add(number);
            }
        }

        return result;
    }

    public void battle(Hero hero1, Hero hero2) {
        if(hero1.getAge() < hero2.getAge()) {
            System.out.println(hero2.getName() + " is the winner");
        } else {
            System.out.println(hero1.getName() + " is the winner.");
        }
    }
}
