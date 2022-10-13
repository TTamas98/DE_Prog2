package com.demo.lesson4.console;

import java.io.IOException;

public class ConsoleReadingMain {
    public static void main(String[] args) throws IOException {
        ConsoleReading consoleReading = new ConsoleReading();

        //System.out.println(consoleReading.readWithBufferedReader());
        //System.out.println(consoleReading.readWithConsoleClass());
        //System.out.println(consoleReading.readWithScanner());
        consoleReading.printFromArguments(args);
    }
}
