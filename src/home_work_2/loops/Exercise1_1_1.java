package home_work_2.loops;

import java.util.Scanner;

public class Exercise1_1_1 {
      public String numberMult (int number){
        int resault=1;
        String resultString = "";

        if (number==12) {
            return "��� Int ����������";
        }
        if(number<0){
            return "�� ����� ������������� �����!";
        }
        for(int i = 1; i <= number; i++) {
            if (i!=number) {
                resault *= i;
                resultString =resultString + i + " * ";
            }
            if (i==number){
                resault *= i;
                resultString =resultString + i +" = "+resault;
            }
        }
        return resultString;
    }
}
