package com.demo.practice.mediaFile;

import java.time.LocalDate;
import java.util.Objects;

public class VideoFile extends MediaFile implements VideoService {

    VideoFormat videoFormat;

    boolean containsSubtitles;

    int numberOfDubs;

    long length;

    String currentDub;

    public VideoFile(double size, String name, LocalDate date, VideoFormat videoFormat, boolean containsSubtitles, int numberOfDubs, long length, String currentDub) {
        super(size, name, date);
        this.videoFormat = videoFormat;
        this.containsSubtitles = containsSubtitles;
        this.numberOfDubs = numberOfDubs;
        this.length = length;
        this.currentDub = currentDub;
    }

    @Override
    public void play() {
        System.out.printf("Playing Video: %s", getName());
    }

    @Override
    public void switchDub(String dub) {
        if(numberOfDubs == 1) {
            throw new NoOtherDubException("No other dub available for this video");
        }
        this.currentDub = dub;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoFile videoFile = (VideoFile) o;
        return containsSubtitles == videoFile.containsSubtitles && numberOfDubs == videoFile.numberOfDubs && length == videoFile.length && videoFormat == videoFile.videoFormat && Objects.equals(currentDub, videoFile.currentDub);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoFormat, containsSubtitles, numberOfDubs, length, currentDub);
    }
}
