package com.example.introductionto.SampleLearning;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//@Component  // Here we can use Service and Repository as well on the basis of Requirements
// Commented due to using an own obj conf from AppConfig file

public class Apple {
    void eatApple()
    {
        System.out.println("I'm eating the Apple");
    }
    @PostConstruct // When we run application in that case it first checks this Annotation then create the Object of it
    void callThisBeforeAppleIsUsed()
    {
        System.out.println("Creating the apple before use");
    }
    @PreDestroy //It prints before the destroying the object of apple class
    void callThisBeforeDestroy()
    {
        System.out.println("Destroying the apple bean");
    }
}
