package test.home_work_2;

import home_work_2.arrays.Exercise2_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise2_4Test {
    Exercise2_4 arrayOperations = new Exercise2_4();
    //2.4.1
    @Test
    public void testSumChetArray() {
        int [] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals(30, arrayOperations.sumChetArray(array));
    }
    //2.4.2
    @Test
    public void testMaxChetArray() {
        int [] array = new int[]{1, 6, 34, 4, 5, 12, 7, 8, 9, 10};
        Assertions.assertEquals(34, arrayOperations.maxChetArray(array));
    }
    //2.4.3
    @Test
    public void testMinAverage() {

        int [] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals("1 2 3 4 ", arrayOperations.minAverage(array));

    }
    //2.4.4
    @Test
    public void testTwoMinInArray() {
        int [] array = new int[]{1, 2, 24, 4, 5, 1, 7, 99, 9, 36};
        Assertions.assertEquals("Минимальные числа = 1 1", arrayOperations.twoMinInArray(array));
    }
    //2.4.5
    @Test
    public void testCompressArray() {
        int [] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals("[5, 6, 7, 8, 9, 10, 0, 0, 0, 0]", arrayOperations.compressArray(1, 4,array));
    }
    //2.4.6
    @Test
    public void testSummAllNumber() {
        int [] array = new int[]{123, 456, 789};
        Assertions.assertEquals(45, arrayOperations.summAllNumber(array));
    }

}
