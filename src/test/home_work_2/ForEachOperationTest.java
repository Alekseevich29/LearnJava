package test.home_work_2;

import home_work_2.arrays.ForEachOperation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ForEachOperationTest {
    ForEachOperation forEachOperation = new ForEachOperation();
    int [] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    @Test
    public void testPrintAll (){
        Assertions.assertEquals("1 2 3 4 5 6 7 8 9 10 ", forEachOperation.printAll(array));
    }
    @Test
    public void testPrintEverySecond (){
        Assertions.assertEquals("1 3 5 7 9 ", forEachOperation.printEverySecond(array));
    }

    @Test
    public void testPrintReversed (){
        Assertions.assertEquals("10 9 8 7 6 5 4 3 2 1 ", forEachOperation.printReversed(array));
    }
}
