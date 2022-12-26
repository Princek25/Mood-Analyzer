package com.bridgelabz;

public class MoodAnalyzer {
    private String message;

    MoodAnalyzer() {

    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else
            return "HAPPY";
    }
}
