package HomeWork1;

import java.util.Scanner;

public class Exercise4_6 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");
        int a = console.nextInt();
        if (a%4==0){
            System.out.println("Год "+a+" Высокосный!");
        }else System.out.println("Год "+a+" Не высокосный!" );
    }
}
