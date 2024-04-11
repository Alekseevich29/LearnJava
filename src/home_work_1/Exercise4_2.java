package home_work_1;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("¬ведите первое число");
        int a = console.nextInt();
        System.out.println("¬ведите второе число");
        int b = console.nextInt();
        System.out.println("¬ведите третье число");
        int c = console.nextInt();
        if (a==b||b==c||a==c) System.out.println("¬вели одинаковые числа.");

        if ((a >= b & a >= c)|| (a <= b & a <= c)) {
            } else System.out.println("a среднее число " + a);

        if ((b >= a & b >= c) || (b <= a & b <= c)) {
            } else System.out.println("b среднее число " + b);

        if ((c >= a & c >= b) || (c <= a & c <= b)) {
            } else System.out.println("c среднее число " + c);
    }

    public static String absNumber (int firstNumber, int secondNumber, int nextNumber){
        if (firstNumber==secondNumber||secondNumber==nextNumber||firstNumber==nextNumber) {
            return "¬вели одинаковые числа.";
        }

        if ((firstNumber >= secondNumber & firstNumber >= nextNumber)|| (firstNumber <= secondNumber & firstNumber <= nextNumber)) {
        } else return "—реднее число = " + firstNumber;//firstNumber  среднее число

        if ((secondNumber >= firstNumber & secondNumber >= nextNumber) || (secondNumber <= firstNumber & secondNumber <= nextNumber)) {
        } else return "—реднее число = "+ secondNumber; // secondNumber среднее число

        if ((nextNumber >= firstNumber & nextNumber >= secondNumber) || (nextNumber <= firstNumber & nextNumber <= secondNumber)) {
        } else return "—реднее число = "+ nextNumber; // nextNumber среднее число
        return "";
    }
}
