package HomeWork1;

import java.util.Scanner;

public class Exercise6_1 {
    public static void main(String[] agr) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя!");
        String name = console.nextLine();
        if (name.equals("Вася")){
            System.out.printf("Привет \nЯ тебя так долго ждал");
        }
        if(name.equals("Анастасия")){ System.out.printf("Я тебя так долго ждал");

        } else System.out.println("Добрый день, а вы кто?");

    }
}
