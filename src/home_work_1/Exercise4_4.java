package home_work_1;

import java.util.Scanner;

public class Exercise4_4 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число которое нужно перевести в байты или килобайты");
        double a = console.nextDouble();  // предполагаю что пользователь вводит число Битов.
        System.out.println("Переводить в байты? 1-да, 2-нет.");
        int vibor = console.nextInt();
        resultByte(a,vibor);

    }

    public static double resultByte (double number, int vibor){
        double result = 0;
        if (vibor==1){
            result = number / 8 ;
            return result;
        }else {
            result = number / 8000;
            return  result;
        }
    }
}
