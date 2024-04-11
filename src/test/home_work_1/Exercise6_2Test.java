package test.home_work_1;

import home_work_1.Exercise6_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6_2Test {
    Exercise6_2 testName = new Exercise6_2();
    @Test
    public void testNameVasia() {
        Assertions.assertEquals("Привет Я тебя так долго ждал", testName.welcom("Вася"));
    }

    @Test
    public void testNameAnastasia() {
        Assertions.assertEquals("Я тебя так долго ждал", testName.welcom("Анастасия"));
    }
    @Test
    public void testBadName() {
        Assertions.assertEquals("Добрый день, а вы кто?", testName.welcom("Коля"));
    }
}
