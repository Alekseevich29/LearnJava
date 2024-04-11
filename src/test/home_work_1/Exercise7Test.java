package test.home_work_1;

import home_work_1.Exercise7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise7Test {
    @Test
    public void testNumberWork() {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Assertions.assertEquals("(123) 456-7890", Exercise7.createPhoneNumber(digits));
    }
    @Test
    public void testNumberDontWork() {
        int[] digits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0,11,12};
        Assertions.assertEquals("Массив должен содержать ровно 10 цифр", Exercise7.createPhoneNumber(digits));
    }

}
