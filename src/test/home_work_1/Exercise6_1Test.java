package test.home_work_1;

import home_work_1.Exercise6_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6_1Test {
    Exercise6_1 testName =new Exercise6_1();
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
