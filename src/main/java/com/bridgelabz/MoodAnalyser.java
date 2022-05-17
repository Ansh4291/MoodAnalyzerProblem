package com.bridgelabz;

public class MoodAnalyser {
  public static String message;
  public MoodAnalyser(String message){
      this.message = message;

  }
    public String analyseMood() throws MoodAnalyserExceptionHandling {
      try{
          if (message.length() == 0)
              throw new MoodAnalyserExceptionHandling(MoodAnalyserExceptionHandling.ExceptionType.EMPTY , "Please enter proper message!");
         else if (message.contains("sad"))
              return "SAD";
          else
              return "HAPPY";
      }catch(NullPointerException e) {
          throw new MoodAnalyserExceptionHandling(MoodAnalyserExceptionHandling.ExceptionType.NULL , "Please enter proper message!");
      }

      }


}
