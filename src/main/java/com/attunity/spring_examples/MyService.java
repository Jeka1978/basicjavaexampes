package com.attunity.spring_examples;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyService {
    @Scheduled(fixedDelay = 1000)
    public void doWork(){
        System.out.println("Worknig....");
    }

    public double plus(double d1, double d2) {
        return d1+d2;
    }



}
