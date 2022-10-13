package com.demo.lesson4.file;

import com.demo.lesson5.hero.Hero;

import java.io.*;
import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.List;
import java.util.Scanner;

public class FileHandler {

    private final File file;

    public FileHandler(String fileName) {
        this.file = new File(fileName);
    }

    public void writeWithBufferedWriter(String toWrite)  {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file, true)))  {
            writer.append(toWrite);
            System.out.println("I am Try");
            throw new MalformedParameterizedTypeException("Hello there");
        } catch (IOException e) {
            System.out.println("I am the first catch");
        } catch (NullPointerException e) {
            System.out.println("I am the second catch");
        } catch (RuntimeException e) {
            System.out.println("I am the third catch");
        } finally {
            System.out.println("I am finally");
        }
    }

    public void writeWithPrintWriter(String toWrite) {
        try (PrintWriter printWriter = new PrintWriter(new FileOutputStream(file,true))) {
            printWriter.println(toWrite);
        } catch (IOException e) {
            System.out.println("I am the first catch");
        } catch (NullPointerException e) {
            System.out.println("I am the second catch");
        } catch (RuntimeException e) {
            System.out.println("I am the third catch");
        } finally {
            System.out.println("I am finally");
        }
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
