package test.home_work_1;

import home_work_1.Exercise6_2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6_2Test {
    Exercise6_2 testName = new Exercise6_2();
    @Test
    public void testNameVasia() {
        Assertions.assertEquals("������ � ���� ��� ����� ����", testName.welcom("����"));
    }

    @Test
    public void testNameAnastasia() {
        Assertions.assertEquals("� ���� ��� ����� ����", testName.welcom("���������"));
    }
    @Test
    public void testBadName() {
        Assertions.assertEquals("������ ����, � �� ���?", testName.welcom("����"));
    }
}
