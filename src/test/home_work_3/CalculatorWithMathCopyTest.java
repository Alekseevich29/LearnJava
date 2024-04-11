package test.home_work_3;


import home_work_3.calcs.simple.CalculatorWithMathCopy;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

//4.1 + 15 * 7 + (28 / 5) ^ 2
public class CalculatorWithMathCopyTest {
    CalculatorWithMathCopy calculator = new CalculatorWithMathCopy();

    @Test
    public void testPlus() {
        double result = calculator.plus(4.1, 15);
        Assertions.assertEquals(19.1, result);
    }

    @Test
    public void testMinus() {
        double result = calculator.minus(10, 5.5);
        Assertions.assertEquals(4.5, result);
    }

    @Test
    public void testMultiply() {
        double result = calculator.multiply(4, 5);
        Assertions.assertEquals(20, result);
    }

    @Test
    public void testDivide() {
        double result = calculator.divide(20, 4);
        Assertions.assertEquals(5, result);
    }

    @Test
    public void testDegree() {
        double result = calculator.degree(5, 2);
        Assertions.assertEquals(25, result,0.0);
    }

    @Test
    public void testModule() {
        double result = calculator.module(-10);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void testSqRoot() {
        double result = calculator.sqRoot(16);
        Assertions.assertEquals(4, result);
    }
}
