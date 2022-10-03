package com.demo.lesson4.file;

import java.io.*;
import java.util.Scanner;

public class FileHandler {

    private final File file;

    public FileHandler(String fileName) {
        this.file = new File(fileName);
    }

    public void writeWithBufferedWriter(String toWrite) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
        //writer.write(toWrite);
        writer.append(toWrite);
        writer.close();
    }

    public void writeWithPrintWriter(String toWrite) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileOutputStream(file,true));
        printWriter.println(toWrite);
        printWriter.close();
    }

    public void writeWithFileOutputStream(String toWrite) throws IOException {
        FileOutputStream fs = new FileOutputStream(file);
        fs.write(toWrite.getBytes());
        fs.close();
    }

    public void readWithBufferedReader() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();
    }

    public void readWithScanner() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        System.out.println(scanner.nextLine());
    }

    public void readAllWithScanner() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }

}
