package com.attunity.heroes;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RandomUtil {

    private static Random random = new Random();

    public static int getIntInRange(Range range) {
        return range.getMin() + random.nextInt(range.getMax() - range.getMin());
    }
}
