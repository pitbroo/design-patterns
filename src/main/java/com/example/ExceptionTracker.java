package com.example;

public class ExceptionTracker {
    private static volatile ExceptionTracker instance;
    private volatile boolean hasExceptionOccurred;

    private ExceptionTracker(){
        hasExceptionOccurred = false;
    }
    public static synchronized ExceptionTracker getInstance(){
        if (instance == null) {
            instance = new ExceptionTracker();
        }
        return instance;
    }

    public boolean hasExceptionOccurred() {
        return hasExceptionOccurred;
    }

    public void setExceptionOccurred(boolean hasExceptionOccurred) {
        this.hasExceptionOccurred = hasExceptionOccurred;
    }

}
