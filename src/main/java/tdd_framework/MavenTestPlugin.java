package tdd_framework;

/**
 * @author Evgeny Borisov
 */
public class MavenTestPlugin {
    public static void main(String[] args) {
        TestRunner.runTestsFromClass("tdd_framework.CalcTest");
    }
}
