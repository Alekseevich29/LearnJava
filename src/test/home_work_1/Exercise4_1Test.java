package test.home_work_1;


import home_work_1.Exercise4_1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Exercise4_1Test {
    @Test
    public void testBothNumbersOdd() {
        Assertions.assertEquals("��� ����� ��������.", Exercise4_1.evenNumbers(3, 5));
    }
    @Test
    public void testFirstNumberOdd() {
        Assertions.assertEquals("������ ����� �������� = 3", Exercise4_1.evenNumbers(3, 4));
    }

    @Test
    public void testSecondNumberOdd() {
        Assertions.assertEquals("������ ����� �������� = 5", Exercise4_1.evenNumbers(2, 5));
    }

    @Test
    public void testBothNumbersEven() {
        Assertions.assertEquals("��� �������� �����.!!", Exercise4_1.evenNumbers(2, 4));
    }

    @Test
    public void testEqualNumbers() {
        Assertions.assertEquals("��� ����� ��������.", Exercise4_1.evenNumbers(3, 3));
    }
}
