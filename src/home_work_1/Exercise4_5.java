package home_work_1;

import java.util.Scanner;

public class Exercise4_5 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("������� �����, ���������� ����� � ������� ASC|| (0-127)");
        int a = console.nextInt();
        if(a<0 || a>127)  System.out.println("����� ������� �� ������� ������� ASC||");
        else
        {
            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))
            {
                System.out.println("����� �������� ����� ���������� �����");
            }
            else System.out.println("����� �������� ����� �������");
        }
    }

    public static String serchNumber (int numberCode){
        if(numberCode<0 || numberCode>127)  return "����� ������� �� ������� ������� ASC||";
        else
        {
            if ((numberCode >= 65 && numberCode <= 90) || (numberCode >= 97 && numberCode <= 122))
            {
                return "����� �������� ����� ���������� �����";
            }
            else return "����� �������� ����� �������";
        }
    }
}