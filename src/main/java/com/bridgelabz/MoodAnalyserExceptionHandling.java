package com.bridgelabz;

import java.security.PublicKey;

public class MoodAnalyserExceptionHandling extends Exception{
    ExceptionType type;

    enum ExceptionType {
        NULL , EMPTY
    }
    public MoodAnalyserExceptionHandling(ExceptionType type , String message){
        super(message);
        this.type = type;
    }
}
