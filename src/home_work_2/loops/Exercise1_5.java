package home_work_2.loops;

import java.util.Random;
import java.util.Scanner;

public class Exercise1_5 {
        public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите Минимум");
        String entNumber = console.next();

        }
    // Задача 1.5.1
    public static void LargestNumber (String numberNatural){
        int max = 0;
        for (int i = 0; i < numberNatural.length(); i++) {
            int maxOfAll = Integer.parseInt(numberNatural.charAt(i)+"");
            if (max>maxOfAll){
                max=max;
            }
            if (max<maxOfAll){
                max=maxOfAll;
            }
        }
        System.out.println("Найбольшая цифра = " +max);

    }
    // Задача 1.5.2
    public static void RandomNumberPersent (){
        final Random random = new Random();
        int randomNumber = 0;
        int counter = 0;
        for (int i = 0; i < 1000; i++) {
            randomNumber = random.nextInt();
            if (randomNumber%2==0){
                counter++;
            }
        }
        System.out.println("Количество случайных четных чисел = "+counter+
                "\nА процент составляет "+((counter*100)/1000)+"%");
    }
    //Задача 1.5.3
    public static void EvenAndOdd (String numberReader){
        int counterOne = 0;
        int counterTwo = 0;
        String numberOne = "";
        String numberTwo = "";
        for (int i = 0; i < numberReader.length(); i++) {
            if(numberReader.charAt(i)%2==0){
                counterOne++;
                numberOne=numberOne + numberReader.charAt(i)+" ";
            }else {counterTwo++;
                numberTwo=numberTwo + numberReader.charAt(i)+" ";
            }

        }
        System.out.println("Четные числа = " + numberOne+
                "\nЧетных чисел = "+ counterOne +
                "\nНечетные числа = "+ numberTwo+
                "\nНечетных чисел = "+ counterTwo);
    }
    //Задача 1.5.4
    public static void FibonachiNumbers (int numberNeed){
        int number1 = 1;
        int number2 = 1;
        int number3;
        System.out.print( number1 + " " +number2 + " ");
        for (int i = 2; i <= numberNeed; i++) {
            number3 = number1 + number2;
            System.out.print(number3 + " ");
            number1 = number2;
            number2 = number3;
        }
    }
    //Задача 1.5.5   Вопрос не совсем ясно задание.
    public static void NumbersSteps (int entNumberMin,int entNumberMax,int entNumberStep){
        for (int i = entNumberMin; i <= entNumberMax ; i++) {
            if (i%entNumberStep==0){
                System.out.print(i+" ");
            }
        }
    }
    //Задача 1.5.6
    public static void ReversOfNumbers (String entNumber){
            String result = "";
        for (int i = 0; i < entNumber.length(); i++) {
            result= entNumber.charAt(i) + result;
        }
        System.out.println("Числа наоборот " + result);
    }
}
