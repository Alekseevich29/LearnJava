package home_work_2.loops;
import java.util.Scanner;
/*Сложно было понять как удалить лишний символ *
Интересная задача. заставила помучиться.
*/
public class Exercise1_2_1 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите целое число для умножения");
        String entNumber = console.next();
        int resualtC =1;

        String resultOfNumber = "";
        for (int i = 0; i < entNumber.length(); i++) {
            if(entNumber.charAt(i)=='.'){           //Проверка на целое число.
                System.out.println("Вы ввели не целое число !!!");
            }
           /* if (entNumber.charAt(i)=='п'){
                System.out.println("Введено не число !!!");
                System.exit(0);
            }*/ //Проверка на строку. Не знаю как проверить на введенное слово а не строку.
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
}
