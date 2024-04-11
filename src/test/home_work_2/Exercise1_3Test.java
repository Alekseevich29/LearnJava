package test.home_work_2;

import home_work_2.loops.Exercise1_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1_3Test {
    Exercise1_3 mult = new Exercise1_3();
    @Test
    public void testPowerInteger() {
        Assertions.assertEquals("18.0 ^ 5 = 1889568.0", mult.power(18,5));
    }
    @Test
    public void testPowerDouble() {
        Assertions.assertEquals("7.5 ^ 2 = 56.25", mult.power(7.5,2));
    }
    @Test
    public void testPowerNegativeNumber() {
        Assertions.assertEquals("¬вели отрицательную степень", mult.power(2,-2));
    }

}
