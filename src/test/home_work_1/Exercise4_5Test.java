package test.home_work_1;

import home_work_1.Exercise4_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise4_5Test {
        @Test
        public void testSerchNumber() {
            Assertions.assertEquals("Число является кодом английской буквы", Exercise4_5.serchNumber(75));
        }
    @Test
    public void testSerchNumberSimbol() {
        Assertions.assertEquals("Число является кодом символа", Exercise4_5.serchNumber(95));
    }
    @Test
    public void testSerchNumberSimbolOut() {
        Assertions.assertEquals("Число выходит за пределы таблицы ASC||", Exercise4_5.serchNumber(129));
    }

}
