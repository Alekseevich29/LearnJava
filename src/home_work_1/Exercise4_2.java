package home_work_1;

import java.util.Scanner;

public class Exercise4_2 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("������� ������ �����");
        int a = console.nextInt();
        System.out.println("������� ������ �����");
        int b = console.nextInt();
        System.out.println("������� ������ �����");
        int c = console.nextInt();
        if (a==b||b==c||a==c) System.out.println("����� ���������� �����.");

        if ((a >= b & a >= c)|| (a <= b & a <= c)) {
            } else System.out.println("a ������� ����� " + a);

        if ((b >= a & b >= c) || (b <= a & b <= c)) {
            } else System.out.println("b ������� ����� " + b);

        if ((c >= a & c >= b) || (c <= a & c <= b)) {
            } else System.out.println("c ������� ����� " + c);
    }

    public static String absNumber (int firstNumber, int secondNumber, int nextNumber){
        if (firstNumber==secondNumber||secondNumber==nextNumber||firstNumber==nextNumber) {
            return "����� ���������� �����.";
        }

        if ((firstNumber >= secondNumber & firstNumber >= nextNumber)|| (firstNumber <= secondNumber & firstNumber <= nextNumber)) {
        } else return "������� ����� = " + firstNumber;//firstNumber  ������� �����

        if ((secondNumber >= firstNumber & secondNumber >= nextNumber) || (secondNumber <= firstNumber & secondNumber <= nextNumber)) {
        } else return "������� ����� = "+ secondNumber; // secondNumber ������� �����

        if ((nextNumber >= firstNumber & nextNumber >= secondNumber) || (nextNumber <= firstNumber & nextNumber <= secondNumber)) {
        } else return "������� ����� = "+ nextNumber; // nextNumber ������� �����
        return "";
    }
}
