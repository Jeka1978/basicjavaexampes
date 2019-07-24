package tdd_framework;

/**
 * @author Evgeny Borisov
 */
public class CalcTest {

    @MyTest
    public void stam(){
        System.out.println("********STAM***********");
    }



    public void testPlus() {
        System.out.println("test plus is running");
        Calc calc = new Calc();
        int answer = calc.plus(2, 3);
        Assertions.assertEquals(5, answer);

    }
    public void testMinus() {
        System.out.println("test minus is running");

    }
}
