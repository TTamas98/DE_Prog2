package com.demo.lesson4.file.exercise;

import java.io.File;

public class ExerciseSolution {

    public String findLargestFileInDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        String[] filesInDirectory = directory.list();
        File largestFile = searchLargestFile(directoryPath, filesInDirectory);
        return largestFile.getAbsolutePath();
    }

    private File searchLargestFile(String directory, String[] fileNames) {
        File largestFile = null;
        for(String file: fileNames) {
            File fileInDirectory = new File(directory + "//" + file);
            if(largestFile == null) {
                largestFile = fileInDirectory;
            } else if(largestFile.length() < fileInDirectory.length()) {
                largestFile = fileInDirectory;
            }
        }
        return largestFile;
    }
}
