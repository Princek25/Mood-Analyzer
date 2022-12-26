package com.bridgelabz;

public class MoodAnalyzerMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Mood Analyzer Program");
        MoodAnalyzer mood1 = new MoodAnalyzer("i am sad");
        System.out.println(mood1.analyzeMood("i am sad"));
        MoodAnalyzer mood2 = new MoodAnalyzer("i am happy");
        System.out.println(mood2.analyzeMood("i am happy"));
    }
}
