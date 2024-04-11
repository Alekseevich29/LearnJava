package home_work_1;

import java.util.Scanner;

public class Exercise4_6 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите год");
        int a = console.nextInt();

    }
    public static String years (int yesr ){
        if (yesr%4==0){
            return "Год "+yesr+" Высокосный!";
        }else return "Год "+yesr+" Не высокосный!";
    }
}
