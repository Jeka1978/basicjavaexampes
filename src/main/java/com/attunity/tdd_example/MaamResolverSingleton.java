package com.attunity.tdd_example;

/**
 * @author Evgeny Borisov
 */
public class MaamResolverSingleton {
    private static MaamResolverSingleton ourInstance = new MaamResolverSingleton();

    public static MaamResolverSingleton getInstance() {
        return ourInstance;
    }

    private MaamResolverSingleton() {
    }

    public double getMaam() {
        return 0.17;
    }
}
