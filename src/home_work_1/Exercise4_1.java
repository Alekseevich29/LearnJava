package home_work_1;

import java.util.Scanner;

public class Exercise4_1 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("������� ������ �����");
        int a = console.nextInt();
        System.out.println("������� ������ �����");
        int b = console.nextInt();
        int result;
        if (a%2!=0 && b%2!=0) {
            System.out.println("��� ����� ��������.");
        }else if (a%2!=0){
            System.out.println("������ ����� �������� "+(result=a));
        }else if (b%2!=0){
            System.out.println("������ ����� �������� "+(result=b));
        }else System.out.println("��� �������� �����.!!");
    }

    public static String evenNumbers (int number,int secondNumber){

        if (number%2!=0 && secondNumber%2!=0) {
            return "��� ����� ��������.";
        }else if (number%2!=0){
            return "������ ����� �������� = " + number;
        }else if (secondNumber%2!=0){
            return "������ ����� �������� = " + secondNumber;
        }else System.out.println("��� �������� �����.!!");
        return "��� �������� �����.!!";
    }
}
