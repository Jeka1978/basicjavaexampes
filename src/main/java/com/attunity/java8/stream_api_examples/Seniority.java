package com.attunity.java8.stream_api_examples;

import lombok.AllArgsConstructor;

import java.util.Arrays;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public enum Seniority {
    JUNIOR(0,10),MIDDLE(11,20),ARCHITECT(21,Integer.MAX_VALUE);
    private final int min;
    private final int max;


    public static Seniority findBySalary(int salary) {
        Seniority[] values = values();
       return Arrays.stream(values)
                .filter(seniority -> seniority.min<=salary)
                .filter(seniority -> seniority.max>=salary)
                .findAny()
                .get();

    }
}







