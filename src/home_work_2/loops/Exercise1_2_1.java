package home_work_2.loops;
import java.util.Scanner;
//Не уверен что тут стоит использовать try catch. Через регулярные выражения не получилось.
public class Exercise1_2_1 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число положительное для умножения");
        String entNumber="";
        int resualtC =1;
        String resultOfNumber = "";
        try {
            entNumber= console.next();
            for (int i = 0; i < entNumber.length(); i++) {
            if(entNumber.charAt(i)=='.'){           //Проверка на целое число. Если в строке находиться точка то число не целое.
                System.out.println("Вы ввели не целое число !!!");
            }

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
        }
        catch (NumberFormatException e){
            System.out.println("Ввели строку а не число");
        }
    }
}
