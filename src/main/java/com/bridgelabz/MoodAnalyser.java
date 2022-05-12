package com.bridgelabz;

public class MoodAnalyser {
  public static String message;
  public MoodAnalyser(String message){
      this.message = message;
      analyseMood();
  }
    public String analyseMood(){
        if (message.contains("Sad"))
            return "SAD";
//        else if (message.contains("Happy"))
//            return "HAPPY";
        else
            return "HAPPY";

    }

}
