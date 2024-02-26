package home_work_2.loops;

import java.util.Scanner;
//Вроде работает но почему то вводить нужно через запятую?
// Пример 7,5 ^ 5 работает. а если ввести 7.5 не работает (Вроде из за локали русской) но не уверен.
public class Exercise1_3 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        double entNumber = console.nextDouble();
        System.out.println("Введите второе число");
        int nextNumber = console.nextInt();
        double resualt = 1;
        
        for (int i = 0; i <nextNumber ; i++) {
            resualt=resualt*entNumber;
        }
        System.out.println(entNumber+" ^ "+nextNumber+" = "+resualt);

    }
}
