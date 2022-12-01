package com.demo.practice.mediaFile;

import java.time.LocalDate;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;

public class Directory implements Iterable<MediaFile>, DirectoryService {

    private Set<MediaFile> mediaFileSet = new HashSet<>();

    @Override
    public Iterator<MediaFile> iterator() {
        return mediaFileSet.iterator();
    }

    @Override
    public void captureVideo(double size, String name, LocalDate date, VideoFormat videoFormat, boolean containsSubtitles, int numberOfDubs, long length, String currentDub) {
        VideoFile videoFile = new VideoFile(size, name, date, videoFormat, containsSubtitles, numberOfDubs, length, currentDub);
        mediaFileSet.add(videoFile);
    }

    @Override
    public void capturePicture(double size, String name, LocalDate date, PictureFormat format, boolean isColorized, int bitDepth) {
        Picture picture = new Picture(size,name,date,format,isColorized,bitDepth);
        mediaFileSet.add(picture);
    }
}
