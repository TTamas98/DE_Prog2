package com.demo.practice.mediaFile;

import java.time.LocalDate;

public abstract class MediaFile {


    private double size;
    private String name;
    private LocalDate date;

    public MediaFile(double size, String name, LocalDate date) {
        this.size = size;
        this.name = name;
        this.date = date;
    }

    public void modifyDate() {
        date = LocalDate.now();
    }

    public void modifyName(String name) {
        this.name = name;
    }

    public abstract void play();

    public double getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
