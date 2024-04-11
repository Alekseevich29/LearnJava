package test.home_work_1;

import home_work_1.Exercise4_4;
import home_work_1.Exercise4_6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4_6Test {
    @Test
    public void testYearsNo() {
        Assertions.assertEquals("Год "+2013+" Не высокосный!", Exercise4_6.years(2013));
    }
    @Test
    public void testYearsYes() {
        Assertions.assertEquals("Год "+2014+" Не высокосный!", Exercise4_6.years(2014));
    }
}
