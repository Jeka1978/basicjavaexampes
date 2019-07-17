package com.attunity.lesson1;

import lombok.*;

import java.util.List;
import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Data
@Builder
public class Employee {
    private int age;
    private int salary;
    private Integer bonus;
    @Singular
    private Map<String,Integer> beers;

    @Singular("oneFish")
    private List<String> fish;


    @NonNull
    private String name;

}
