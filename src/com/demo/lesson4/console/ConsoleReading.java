package com.demo.lesson4.console;

import java.io.*;
import java.util.Scanner;

public class ConsoleReading {

    public String readWithBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        return bufferedReader.readLine();
    }

    public String readWithScanner() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine(); // Many other next method
    }

    public String readWithConsoleClass() {
        return System.console().readLine();
    }

    public void printFromArguments(String[] args) {
        if(args.length > 0) {
            for(String arg: args) {
                System.out.println(arg);
            }
        }
    }
}
