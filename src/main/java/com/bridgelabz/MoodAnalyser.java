package com.bridgelabz;

public class MoodAnalyser {
    public String analyseMood(String message){
        if (message.contains("Sad"))
            return "Sad";
        else if (message.contains("Happy"))
            return "Happy";
        else
            return null;

    }

}
