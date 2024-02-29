package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        int [] oneArray = new int[]{1,2,3,4,5,6};
        int [] twoArray = new int[]{1,1,1,1};
        int [] threeArray = new int[]{9,1,5,99,9,9};
        int [] fourArray =  new int[]{};
        int [] fiveArray = new int[]{6,5,4,3,2,1};
        SortsUtils testSort = new SortsUtils();
        //4.2.2.1
        System.out.print("Массив до сортировки  = "+ Arrays.toString(oneArray)+" ");
        testSort.shake(oneArray);
        System.out.println("Массив после сортировки Шейкер = "+ Arrays.toString(oneArray));
        testSort.sort(oneArray);
        System.out.println("Массив после сортировки Пузырьком = "+ Arrays.toString(oneArray));
        //4.2.2.2
        System.out.print("Массив до сортировки  = "+ Arrays.toString(twoArray)+" ");
        testSort.shake(twoArray);
        System.out.println("Массив после сортировки Шейкер = "+ Arrays.toString(twoArray));
        testSort.sort(twoArray);
        System.out.println("Массив после сортировки Пузырьком = "+ Arrays.toString(twoArray));
        //4.2.2.3
        System.out.print("Массив до сортировки  = "+ Arrays.toString(threeArray)+" ");
        testSort.shake(threeArray);
        System.out.println("Массив после сортировки Шейкер = "+ Arrays.toString(threeArray));
        testSort.sort(threeArray);
        System.out.println("Массив после сортировки Пузырьком = "+ Arrays.toString(threeArray));
        //4.2.2.4
        System.out.print("Массив до сортировки  = "+ Arrays.toString(fourArray)+" ");
        testSort.shake(fourArray);
        System.out.println("Массив после сортировки Шейкер = "+ Arrays.toString(fourArray));
        testSort.sort(fourArray);
        System.out.println("Массив после сортировки Пузырьком = "+ Arrays.toString(fourArray));
        //4.2.2.5
        System.out.print("Массив до сортировки  = "+ Arrays.toString(fiveArray)+" ");
        testSort.shake(fiveArray);
        System.out.println("Массив после сортировки Шейкер = "+ Arrays.toString(fiveArray));
        testSort.sort(fiveArray);
        System.out.println("Массив после сортировки Пузырьком = "+ Arrays.toString(fiveArray));
        //4.2.2
        ArraysUtils arrayRnd = new ArraysUtils();
        int [] arrayTestRnd = ArraysUtils.arrayRandom(50, 100);
        testSort.shake(arrayTestRnd);
        System.out.println("Массив после сортировки Шейкер = "+ Arrays.toString(arrayTestRnd));
        testSort.sort(arrayTestRnd);
        System.out.println("Массив после сортировки Пузырьком = "+ Arrays.toString(arrayTestRnd));
        //4.2.3
        int [] arrayTestConsole =  ArraysUtils.arrayFromConsole();
        testSort.shake(arrayTestConsole);
        System.out.println("Массив после сортировки Шейкер = "+ Arrays.toString(arrayTestConsole));
        testSort.sort(arrayTestConsole);
        System.out.println("Массив после сортировки Пузырьком = "+ Arrays.toString(arrayTestConsole));
    }
}
