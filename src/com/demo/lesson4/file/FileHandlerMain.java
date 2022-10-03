package com.demo.lesson4.file;

import java.io.File;
import java.io.IOException;

public class FileHandlerMain {
    public static void main(String[] args) throws IOException {
        FileHandler fileHandler = new FileHandler("C:\\DE\\hello.txt");
        fileHandler.writeWithFileOutputStream("Hello there\n");
        fileHandler.writeWithBufferedWriter("General Kenobi\n");
        fileHandler.writeWithPrintWriter("You are a bold one\n");

        fileHandler.readWithScanner();
        fileHandler.readWithBufferedReader();
        fileHandler.readAllWithScanner();
    }
}
