package com.demo.practice.mediaFile;

import java.time.LocalDate;
import java.util.Objects;

public class Picture extends MediaFile {

    private PictureFormat format;
    private boolean isColorized;
    private int bitDepth;

    public Picture(double size, String name, LocalDate date, PictureFormat format, boolean isColorized, int bitDepth) {
        super(size, name, date);
        this.format = format;
        this.isColorized = isColorized;
        this.bitDepth = bitDepth;
    }

    @Override
    public void play() {
        System.out.printf("Showing picture: %s", getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Picture picture = (Picture) o;
        return isColorized == picture.isColorized && bitDepth == picture.bitDepth && format == picture.format;
    }

    @Override
    public int hashCode() {
        return Objects.hash(format, isColorized, bitDepth);
    }
}
