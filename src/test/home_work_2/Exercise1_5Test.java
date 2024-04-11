package test.home_work_2;

import home_work_2.loops.Exercise1_5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Exercise1_5Test {
    Exercise1_5 testExercise = new Exercise1_5();
    // Задача 1.5.1
    @Test
    public void testLargestNumber() {
        Assertions.assertEquals(5, testExercise.largestNumber("12345"));
        Assertions.assertEquals(8, testExercise.largestNumber("384928"));
        Assertions.assertEquals(9, testExercise.largestNumber("999"));

    }
    // Задача 1.5.2
    @Test
    public void testRandomNumberPersent() {
        int result = testExercise.randomNumberPersent();
        Assertions.assertEquals(result >= 0 && result <= 1000, true);
    }
    //Задача 1.5.3
    @Test
    public void testEvenAndOdd() {
        String numberReader = "1234567890";
        testExercise.evenAndOdd(numberReader);
        numberReader = "13579";
        testExercise.evenAndOdd(numberReader);
    }
    //Задача 1.5.4
    @Test
    public void testEibonachiNumbers() {
        Assertions.assertEquals("1 1 2 3 5 8 ", testExercise.fibonachiNumbers(5));
        Assertions.assertEquals("1 1 2 3 5 8 ", testExercise.fibonachiNumbers(10));
    }
    //Задача 1.5.5
    @Test
    public void testNumbersSteps() {
        // Проверяем вывод чисел с шагом для диапазона 1 до 10 с шагом 2
        Assertions.assertEquals("2 4 6 8 10 ", testExercise.numbersSteps(1, 10, 2));
        // Проверяем вывод чисел с шагом для диапазона 5 до 20 с шагом 5
        Assertions.assertEquals("2 4 6 8 10 ", testExercise.numbersSteps(5, 20, 5));

    }
    //Задача 1.5.6
    @Test
    public void testReversOfNumbers() {
        Assertions.assertEquals(54321, testExercise.reversOfNumbers("12345"));
        Assertions.assertEquals(987654321, testExercise.reversOfNumbers("123456789"));
        Assertions.assertEquals(13579, testExercise.reversOfNumbers("97531"));
    }
}
