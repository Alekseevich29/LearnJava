package test.home_work_1;

import home_work_1.Exercise4_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4_2Test {

    @Test
    public void testAbsNumber() {
        Assertions.assertEquals("����� ���������� �����.", Exercise4_2.absNumber(3, 3,3));
    }
    @Test
    public void testAbsNumberfirst() {
        Assertions.assertEquals("������� ����� = 2", Exercise4_2.absNumber(2, 1,3));
    }
    @Test
    public void testAbsNumberSecond() {
        Assertions.assertEquals("������� ����� = 2", Exercise4_2.absNumber(1, 2,3));
    }
    @Test
    public void testAbsNumberNext() {
        Assertions.assertEquals("������� ����� = 2", Exercise4_2.absNumber(1, 3,2));
    }
}
