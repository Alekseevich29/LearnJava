package home_work_2.utils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public  class ArraysUtils {
    //Задача 2.1.1
    public static int [] arrayFromConsole(){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите количество элементов которое будет содержать массив");
        int entNumber = console.nextInt();
        int elemArray=0;
        int [] container = new int[entNumber];

        for (int i = 0; i < container.length; i++) {
            System.out.println("Введите элемент "+ i +" массива.");
            elemArray= console.nextInt();
            container[i]= elemArray;
        }
        return container;
    }
    //Задача 2.1.2
    public static int[] arrayRandom(int size, int maxValueExclusion){
        final Random random = new Random();
        int [] entSizeMassiv = new int [size];

        for (int i = 0; i < entSizeMassiv.length; i++) {
            entSizeMassiv[i] = random.nextInt(maxValueExclusion);
        }
        System.out.println(Arrays.toString(entSizeMassiv));
        return entSizeMassiv;
    }
}
