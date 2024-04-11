package test.home_work_2;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortsUtilsTest {
    SortsUtils sortTest = new SortsUtils();
    @Test
    public void testSort() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        Assertions.assertEquals(Arrays.toString(expected), sortTest.sort(arr));
    }
    @Test
    public void testShake() {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        int[] expected = {1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9};
        Assertions.assertEquals(Arrays.toString(expected),sortTest.shake(arr));
    }
}
