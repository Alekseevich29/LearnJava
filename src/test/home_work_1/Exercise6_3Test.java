package test.home_work_1;

import home_work_1.Exercise6_2;
import home_work_1.Exercise6_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise6_3Test {
    Exercise6_3 testName = new Exercise6_3();
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
