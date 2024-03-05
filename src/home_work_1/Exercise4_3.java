package home_work_1;

import java.util.Scanner;

public class Exercise4_3 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        double a = console.nextInt();
        System.out.println("Введите второе число");
        double b = console.nextInt();
        double result;
        if (a%b==0){
            result = a/b;
            System.out.println("Делится без остатка "+result);
        }else if (a%b!=0) {result = a%b;
            int resultCeloe = (int) (a/b);
            System.out.println("Не делится и остаток = "+result+" а целое = "+resultCeloe);
        }
    }
}
