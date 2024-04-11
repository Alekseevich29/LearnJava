package test.home_work_2;

import home_work_2.loops.Exercise1_1_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1_1_1Test {
    Exercise1_1_1 mult = new Exercise1_1_1();
    @Test
    public void testMultyOut() {
        Assertions.assertEquals("Тип Int переполнен", mult.numberMult(12));
    }
    @Test
    public void testMultyNegative() {
        Assertions.assertEquals("Вы ввели отрицательное число!", mult.numberMult(-1));
    }
    @Test
    public void testMulty() {
        Assertions.assertEquals("1 * 2 * 3 * 4 * 5 = 120", mult.numberMult(5));
    }

}
