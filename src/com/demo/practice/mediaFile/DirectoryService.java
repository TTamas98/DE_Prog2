package com.demo.practice.mediaFile;

import java.time.LocalDate;

public interface DirectoryService {

    void captureVideo(double size, String name, LocalDate date, VideoFormat videoFormat, boolean containsSubtitles, int numberOfDubs, long length, String currentDub);
    void capturePicture(double size, String name, LocalDate date, PictureFormat format, boolean isColorized, int bitDepth);
}
