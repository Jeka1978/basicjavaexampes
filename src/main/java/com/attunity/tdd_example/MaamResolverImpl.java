package com.attunity.tdd_example;

import lombok.SneakyThrows;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverImpl implements MaamResolver {

    private double maam;

    @SneakyThrows
    public MaamResolverImpl() {
        //20 lines of code to take maam from web service of mas ahnasa
        Thread.sleep(3000);
        maam = 0.18;
    }

    @Override
    public double getMaam() {
        return maam;
    }
}
