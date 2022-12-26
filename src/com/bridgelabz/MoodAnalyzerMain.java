package com.bridgelabz;

public class MoodAnalyzerMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer Program");
        MoodAnalyzer mood = new MoodAnalyzer();
        System.out.println(mood.analyzeMood("i am in sad mood"));
    }
}
