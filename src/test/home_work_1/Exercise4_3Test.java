package test.home_work_1;

import home_work_1.Exercise4_3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4_3Test {
    @Test
    public void testDelenieNumberTrue() {
        Assertions.assertEquals("Делится без остатка 2.0", Exercise4_3.delenieNumber(8,4));
    }
    @Test
    public void testDelenieNumberFalse() {
        Assertions.assertEquals("Не делится без остатка 2.3333333333333335", Exercise4_3.delenieNumber(7,3));
    }
}
