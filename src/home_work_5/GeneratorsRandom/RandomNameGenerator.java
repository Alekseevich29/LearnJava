package home_work_5.GeneratorsRandom;

import java.util.Random;

public class RandomNameGenerator {

    public static String geterateRandomName(int needLenght) {
        String name;
        Random rndFirst  = new Random();
        name = rndFirst.ints(32,255)
                .limit(needLenght)
                .collect(StringBuilder:: new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
        return name;
    }

    public  static String geterateRandomRusName(int needLenght) {
        String name;
        Random rndFirst  = new Random();
        name = rndFirst.ints(192,255)
                .limit(needLenght)
                .collect(StringBuilder:: new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
        return name;
    }

    public static String geterateRandomRealName() {
        String name;
        Random rndName = new Random();
        String [] realName = new String [] {"Саша","Паша","Олег","Петя","Коля","Виктор","Семён","Сергей","Валентин",
                "Илья","Аня","Катя","Оля","Вика","Настя","Наташа","Галя","Толя","Андрей","Юра","Алла","Никита","Ксюша","Оксана"};
        name = realName [rndName.nextInt(realName.length)];
        return  name;
    }
}
