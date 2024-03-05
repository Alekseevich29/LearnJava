package home_work_1;

import java.util.Scanner;

public class Exercise4_1 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = console.nextInt();
        System.out.println("Введите второе число");
        int b = console.nextInt();
        int result;
        if (a%2!=0 && b%2!=0) {
            System.out.println("Оба числа нечетные.");
        }else if (a%2!=0){
            System.out.println("первое число нечетное "+(result=a));
        }else if (b%2!=0){
            System.out.println("второе число нечетное "+(result=b));
        }else System.out.println("Нет нечетных числе.!!");

    }
}
