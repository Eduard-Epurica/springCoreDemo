package com.example.sprincoredemo.rest;

import com.example.sprincoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("cricketCoach") Coach aCoach){
        myCoach = aCoach;
    }

//    @Autowired
//    public void anyMethod(Coach theCoach){
//        this.myCoach = theCoach;
//    }



    @GetMapping("/dailyworkout")
    public String getDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }



}
