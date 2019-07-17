package com.attunity.lesson1;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class ZooFactory {
    private Random random = new Random();

    public Animal createRandomAnimal() {

        random.nextInt(100);
        return null;
    }
}
