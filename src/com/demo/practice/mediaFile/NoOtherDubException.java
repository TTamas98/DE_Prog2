package com.demo.practice.mediaFile;

public class NoOtherDubException extends RuntimeException {
    public NoOtherDubException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
