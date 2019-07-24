package tdd_framework;

/**
 * @author Evgeny Borisov
 */
public class Assertions {
    public static void assertEquals(Object expected, Object real) {
        if (!expected.equals(real)) {
            throw new IllegalStateException("expected: "+expected+" real was "+real);
        }
    }
}
