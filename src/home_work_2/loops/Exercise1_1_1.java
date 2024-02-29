package home_work_2.loops;

import java.util.Scanner;
//Не знаю как написать проверку с переполнением
public class Exercise1_1_1 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число для умножения");
        int a = console.nextInt();
        if(a<0){
            System.out.println("Вы ввели отрицательное число!");
        }
        int resault=1;
        for(int i = 1; i <= a; i++) {
             if (i!=a) {
                 resault = resault * i;
                 System.out.print(i + " * ");
             }
             if (i==a){
                 if (resault == 0 || resault < 0){
                     System.out.println("\n Тип переполнен!!");
                     break;
                 }
                    System.out.print(" = "+resault);
             }
        }



    }
}
