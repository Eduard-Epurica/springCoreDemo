package com.example.sprincoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout(){
        return "Cricket coach tells you to run a lot and practice fast bowling!!!!";
    }


}
