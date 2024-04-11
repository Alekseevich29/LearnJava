package home_work_1;

import java.util.Scanner;

public class Exercise6_2 implements ICommunicationPrinter{

       public  String welcom (String name) {
        if (name.equals("Вася")) {
            return "Привет Я тебя так долго ждал";
        }else if(name.equals("Анастасия")) {
            return "Я тебя так долго ждал";
        }else { return"Добрый день, а вы кто?";}
    }
}
