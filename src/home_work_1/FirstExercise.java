package home_work_1;

import java.util.Scanner;

public class FirstExercise {
    public static void main (String []agr){

        Scanner console = new Scanner(System.in);

        System.out.println("Введите первое число");
        int a = console.nextInt();  //Ввожу 42 = 0010 0010.

        System.out.println("Введите второе число");
        int b = console.nextInt();  //Ввожу 15 = 1101.

        int firstResault = a & b;  // число 0010 0010 И 1101 получаем 00001010

        int secondResault = a | b;  // число 0010 0010 ИЛИ 1101 получаем 00101111

        System.out.println("Результат побитовых операций: \n 1.Побитовое И = "+firstResault+
                "\n 2.Побитовое ИЛИ = "+secondResault);

    }
}