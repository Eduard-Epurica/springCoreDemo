package com.example.sprincoredemo.rest;

import com.example.sprincoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach theirCoach;

    @Autowired
    public DemoController(@Qualifier("aquatic") Coach aCoach){
        System.out.println("In Constructor: " + getClass().getSimpleName());
        myCoach = aCoach;
    }

//    @GetMapping("/check")
//    public String checkCoach(){
//        return "Comparing beans: myCoach == theirCoach, " + (myCoach==theirCoach);
//    }

//    @Autowired
//    public void anyMethod(Coach theCoach){
//        this.myCoach = theCoach;
//    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){

        return myCoach.getDailyWorkout();
    }



}
