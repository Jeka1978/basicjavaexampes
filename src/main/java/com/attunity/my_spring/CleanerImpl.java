package com.attunity.my_spring;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
@Benchmark
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min=3,max=7)
    private int repeat;


    public void doX(){
        System.out.println("XXXXXXXxxx");
    }

    @Override
    public void clean() {
        IntStream.range(0, repeat).forEach(value -> {
            System.out.println("VVVVVVVVVVVVvvvvvvvvvvvvvvvvvv");
        });
    }
}
