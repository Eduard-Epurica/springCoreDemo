package com.example.sprincoredemo.rest;

import com.example.sprincoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Qualifier;
=======
>>>>>>> Eduard-Epurica/master
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;

    @Autowired
<<<<<<< HEAD
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
=======
    public DemoController(Coach aCoach){

        myCoach = aCoach;
    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
>>>>>>> Eduard-Epurica/master
        return myCoach.getDailyWorkout();
    }



}
