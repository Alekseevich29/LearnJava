package test.home_work_2;

import home_work_2.loops.Exercise1_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1_6Test {
    //�� ����������� ��� ��������� ������� ���������? ������� ���������� �� �������?

   Exercise1_6 testExercise = new Exercise1_6();
    // ������ 1.5.1
    @Test
    public void testLargestNumber() {
    testExercise.multyTable();
    }
}
