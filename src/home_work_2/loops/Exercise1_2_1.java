package home_work_2.loops;
import java.util.Scanner;
public class Exercise1_2_1 {

    public String multiplyDigits(String entNumber) {
        try {
            String resultOfNumber = "";
            int resualtC =1;
            int number = Integer.parseInt(entNumber);
            if (number < 0) {
                return "Пожалуйста, введите положительное целое число.";
            }

            if (number == 0) {
                return "0 * 0 = 0";
            }
            for (int i = 0; i < entNumber.length(); i++) {

                if (i!=entNumber.length()-1){ //
                    resultOfNumber = resultOfNumber + entNumber.charAt(i) + " * ";
                    int numberOfInt = Integer.parseInt("" + entNumber.charAt(i));
                    resualtC = resualtC * numberOfInt;
                }else{
                    resultOfNumber=resultOfNumber+entNumber.charAt(i);
                    int numberOfInt = Integer.parseInt("" + entNumber.charAt(i));
                    resualtC = resualtC * numberOfInt;
                }
            }
            System.out.println(resultOfNumber+" = "+resualtC);
            return resultOfNumber +" = " + resualtC;
        } catch (NumberFormatException e) {
            return "Введено не целое число.";
        }
    }
}
