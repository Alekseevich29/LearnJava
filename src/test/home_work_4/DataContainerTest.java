package test.home_work_4;

import home_work_4.DataContainer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainerTest {
    @Test
    public void testAdd () {
        Integer [] test = new Integer[]{1, 2, 3, null, null, null};
        Integer [] test1 = new Integer[]{1, null, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(test);
        DataContainer<Integer> container1 = new DataContainer<>(test1);
        // добавление элемента
        Assertions.assertEquals(3, container.add(777));
        // добавление элемента
        Assertions.assertEquals(1, container1.add(777));
        //проверка на null
        Assertions.assertEquals(-1, container.add(null));
    }

    @Test
    public void testGet () {
        Integer [] test = new Integer[0];
        Integer [] test1 = new Integer[]{9999};
        DataContainer<Integer> container = new DataContainer<>(test);
        container.add(9999);
        Assertions.assertEquals(9999, container.get(0));
        Assertions.assertEquals(null, container.get(1));
    }

    @Test
    public void testGetItems (){

        DataContainer<Integer> container = new DataContainer<>(new Integer[]{1, 2, 3, 9999});
        Integer [] test = new Integer[]{1, 2, 3, 9999};
        Assertions.assertArrayEquals(test, container.getItems());
    }

    @Test
    public void testDelete (){
        Integer [] test = new Integer[]{1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(test);
        Assertions.assertEquals(true, container.delete(3));
        Assertions.assertEquals(false, container.delete(9));
        Assertions.assertEquals(true, container.delete(2));
    }
    @Test
    public void testDeleteItem (){
        String [] test = new String[]{"1", "2", "3", "777"};
        Integer [] test1 = new Integer[]{1, 2, 3, 777,null};
        DataContainer<String> container = new DataContainer<>(test);
        DataContainer<Integer> container1 = new DataContainer<>(test1);
        Assertions.assertEquals(false, container.delete(null));
        Assertions.assertEquals(false, container1.delete(null));
        Assertions.assertEquals(true, container.delete("777"));
        Assertions.assertEquals(false, container.delete(111));
    }

    @Test
    public void testSort() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[]{3, 1, 3, 777});
        Comparator<Integer> descendingComparator = Comparator.naturalOrder();
        container.sort(descendingComparator);
        Integer[] sortedExpected = new Integer[]{1, 3, 3, 777};
        Assertions.assertArrayEquals(sortedExpected, container.getItems());
    }
    //по длине.
    @Test
    public void testSortString() {
        DataContainer<String> container = new DataContainer<>(new String[]{"i", "hello", "1", "Как домашка"});
        Comparator<String> lengthComparator  = Comparator.comparing(String::length);
        container.sort(lengthComparator);
        String[] sortedExpected = new String[]{"i", "1", "hello", "Как домашка"};
        Assertions.assertArrayEquals(sortedExpected, container.getItems());
    }
    @Test
    public void testToStringEmpty() {
        DataContainer<Integer> containerInt = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        DataContainer<Integer> containerIntNull = new DataContainer<>(new Integer[0]);
        Assertions.assertEquals("[]", containerIntNull.toString());

    }
    @Test
    public void testToStringInt() {
        DataContainer<Integer> containerInt = new DataContainer<>(new Integer[]{1, 2, 3, 777, 3});
        Assertions.assertEquals("[1, 2, 3, 777, 3]", containerInt.toString());
    }
    @Test
    public void testToStringIntWithNull() {
        DataContainer<Integer> containerInt = new DataContainer<>(new Integer[]{1, 2, 3, null});
        Assertions.assertEquals("[1, 2, 3]", containerInt.toString());
    }

}
