package com.attunity.my_spring;

import java.util.stream.IntStream;

/**
 * @author Evgeny Borisov
 */
public class CleanerImpl implements Cleaner {

    @InjectRandomInt(min=3,max=7)
    private int repeat;

    @Override
    public void clean() {
        IntStream.range(0, repeat).forEach(value -> {
            System.out.println("VVVVVVVVVVVVvvvvvvvvvvvvvvvvvv");
        });

    }
}
