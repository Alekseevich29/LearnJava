package home_work_1;


import java.util.Scanner;

public class Exercise4_3 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("������� ������ �����");
        double a = console.nextInt();
        System.out.println("������� ������ �����");
        double b = console.nextInt();
        double result;
        if (a%b==0){
            result = a/b;
            System.out.println("������� ��� ������� "+result);
        }else if (a%b!=0) {result = a%b;
            int resultCeloe = (int) (a/b);
            System.out.println("�� ������� � ������� = "+result+" � ����� = "+resultCeloe);
        }
    }

    public static String delenieNumber (int firstNumber, int secondNumber){
        double result = 0;

        if (firstNumber%secondNumber==0){
            result = (double) firstNumber/secondNumber;
            return "������� ��� ������� "+result;
        }else if (firstNumber%secondNumber!=0) {
            double resultOstatok = firstNumber%secondNumber;
            result = (double) firstNumber/secondNumber; // �� ������� ��� �������
            return "�� ������� ��� ������� "+result;
        }
        return "";
    }
}
