package com.attunity.tdd_example;

import lombok.AllArgsConstructor;

/**
 * @author Evgeny Borisov
 */
@AllArgsConstructor
public class TaxCalc {

    private MaamResolver maamResolver;

    public double withMaam(double price) {
        return maamResolver.getMaam() * price+price;
    }
}






