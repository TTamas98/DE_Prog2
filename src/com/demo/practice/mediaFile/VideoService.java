package com.demo.practice.mediaFile;

public interface VideoService {
    void switchDub(String dub);

    // can override
    default void helloThere() {
        hello();
    }

    // cannot override
    static void helloThereStatic() {
        hello();
    }

    //Do not :)
    private static void hello() {
        System.out.println("Hello There");
    }
}
