package test.home_work_1;

import home_work_1.Exercise4_4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4_4Test {
    @Test
    public void testResultByte() {
        Assertions.assertEquals(125.0, Exercise4_4.resultByte(1000,1));
    }
    @Test
    public void testResultKiloByte() {
        Assertions.assertEquals(1.25, Exercise4_4.resultByte(10000,2));
    }
}
