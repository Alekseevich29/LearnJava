package home_work_1;

import java.util.Scanner;

public class Exercise4_6 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("������� ���");
        int a = console.nextInt();

    }
    public static String years (int yesr ){
        if (yesr%4==0){
            return "��� "+yesr+" ����������!";
        }else return "��� "+yesr+" �� ����������!";
    }
}
