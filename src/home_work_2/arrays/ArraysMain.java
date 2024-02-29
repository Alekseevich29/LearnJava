package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

// Не ясно почему необходимо через объект array вызывать методы?.
public class ArraysMain {
    //Вывод задача 2.1.
    public static void main(String[] args) {
        ArraysUtils array = new ArraysUtils();
        int[] container = array.arrayFromConsole();
        int[] containerRandom = array.arrayRandom(5, 100);
    }
}
