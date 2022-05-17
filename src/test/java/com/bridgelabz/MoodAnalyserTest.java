package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    //
    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyserExceptionHandling {
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is Sad Messgae");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("SAD" , result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyserExceptionHandling {
        MoodAnalyser moodAnalyser = new MoodAnalyser("this is happy message");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        Assertions.assertEquals("HAPPY" , result);
    }
    @Test
    public void givenMoodIsEmpty_ShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        }catch (MoodAnalyserExceptionHandling e){
            System.out.println(e);
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalyserExceptionHandling.ExceptionType.NULL , e.type);
        }

    }

    @Test
    public void givenMoodIsNull_ShouldThrowException(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("");
        try {
            moodAnalyser.analyseMood();
        }catch (MoodAnalyserExceptionHandling e){
            System.out.println(e);
            System.out.println(e.type);
            Assertions.assertEquals(MoodAnalyserExceptionHandling.ExceptionType.EMPTY , e.type);
        }

    }


}
