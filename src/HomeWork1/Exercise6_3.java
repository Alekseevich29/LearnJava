package HomeWork1;

import java.util.Scanner;

public class Exercise6_3 {
    public static void main(String[] agr){
        Scanner console = new Scanner(System.in);
        System.out.println("Введите ваше имя!");
        String name = console.nextLine();
        switch (name){
            case "Вася":
                System.out.printf("Привет \nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.printf("Я тебя так долго ждал");
                break;
            default:System.out.println("Добрый день, а вы кто?");
        }
    }
}
