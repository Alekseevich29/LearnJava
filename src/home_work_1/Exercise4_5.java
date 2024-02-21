package HomeWork1;

import java.util.Scanner;

public class Exercise4_5 {
    //Не знаю как проверить символ какому алфавиту он принадлежит можно конечно применить boolean onlyLatinAlphabet = string.matches("^[a-zA-Z0-9]+$");
    // но не зная как это работает не хочу использовать.
    // программа выводит символ по введенному коду.
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите код символа");
        String a = console.next();
        int dec = Integer.parseInt(a, 8);
        System.out.println("Знак ASCII будет " + (char) dec);
    }
}