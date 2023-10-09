package com.example.sprincoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //Testing multiple instances of a bean
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In Constructor: " + getClass().getSimpleName());
    }

    //Define the init method
    @PostConstruct
    public void startupLogic(){
        System.out.println("We are staring up in: " + getClass().getSimpleName());
    }

    //Define the destroy method
    @PreDestroy
    public void destroyLogic(){
        System.out.println("We are cleaning up in: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){

        return "Cricket coach tells you to run a lot and practice fast bowling!!!! - Setter Injection";

    }


}
