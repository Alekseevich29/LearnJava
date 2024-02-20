package HomeWork1;

import java.util.Scanner;

public class Exercise4_4 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число которое нужно перевести в байты или килобайты");
        double a = console.nextDouble();  // предполагаю что пользователь вводит число Битов.
        System.out.println("Переводить в байты? 1-да, 2-нет.");
        int vibor = console.nextInt();
        if (vibor==1){
            double result = a / 8 ;
            System.out.println("Ваше число в байтах = "+result);
        }else {
            double result = a / 8000;
            System.out.println("Ваше число в килобайтах = "+result);}
    }
}
