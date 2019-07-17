package com.attunity.spring_examples;

import java.math.BigDecimal;

/**
 * @author Evgeny Borisov
 */
public class MyServiceImpl extends MyService {


    public BigDecimal plus(BigDecimal d1, BigDecimal d2) {
        return d1.add(d2);
    }

    public static void main(String[] args) {
        double a=1.1;
        double b=1.3;
        System.out.println(a+b);
    }
}
