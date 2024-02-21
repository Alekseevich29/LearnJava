package HomeWork1;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = console.nextInt();
        System.out.println("Введите второе число");
        int b = console.nextInt();
        System.out.println("Введите третье число");
        int c = console.nextInt();
        if (a==b||b==c||a==c) System.out.println("Ввели одинаковые числа.");

        if ((a >= b & a >= c)|| (a <= b & a <= c)) {
            } else System.out.println("a среднее число " + a);

        if ((b >= a & b >= c) || (b <= a & b <= c)) {
            } else System.out.println("b среднее число " + b);

        if ((c >= a & c >= b) || (c <= a & c <= b)) {
            } else System.out.println("c среднее число " + c);
    }
}
