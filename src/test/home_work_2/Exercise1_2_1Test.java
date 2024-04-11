package test.home_work_2;


import home_work_2.loops.Exercise1_2_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1_2_1Test {
    Exercise1_2_1 mult = new Exercise1_2_1();
    @Test
    public void testMultiplyDigitsNegative() {
        Assertions.assertEquals("Пожалуйста, введите положительное целое число.", mult.multiplyDigits("-1"));
    }
    @Test
    public void testMultiplyNull() {
        Assertions.assertEquals("0 * 0 = 0", mult.multiplyDigits("0"));
    }
     @Test
    public void testMultiplyResult() {
        Assertions.assertEquals("1 * 8 * 1 * 2 * 3 * 2 * 3 * 7 * 5 = 10080", mult.multiplyDigits("181232375"));
    }

    @Test
    public void testMultiplyNotInteger() {
        Assertions.assertEquals("Введено не целое число.", mult.multiplyDigits("99.2"));
    }

}
