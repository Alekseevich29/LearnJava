package test.home_work_1;

import home_work_1.Exercise4_4;
import home_work_1.Exercise4_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4_6Test {
    @Test
    public void testYearsNo() {
        Assertions.assertEquals("��� "+2013+" �� ����������!", Exercise4_6.years(2013));
    }
    @Test
    public void testYearsYes() {
        Assertions.assertEquals("��� "+2014+" �� ����������!", Exercise4_6.years(2014));
    }
}
