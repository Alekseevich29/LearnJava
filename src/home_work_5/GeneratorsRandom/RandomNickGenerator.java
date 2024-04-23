package home_work_5.GeneratorsRandom;

import java.util.Random;

public class RandomNickGenerator {

    public String generatorRandomNick(int needLenght) {
        String nick;
        Random rndFirst  = new Random();
        nick = rndFirst.ints(32,255)
                .limit(needLenght)
                .collect(StringBuilder:: new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
        return nick;
    }

    public String generatorRandomRusNick(int needLenght) {
        String nick;
        Random rndFirst  = new Random();
         nick = rndFirst.ints(192,255)
                .limit(needLenght)
                .collect(StringBuilder:: new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
        return nick;
    }

    public String generatorRandomRealNick() {
        String nick;
        Random rndName = new Random();
        String [] realName = new String [] {"������","����","�����","������","���","�����","������","�����","������",
                "������","����","���","������","���","���","�����","�����","������","��������","������","���������","������","�������","�����"};
        nick = realName [rndName.nextInt(realName.length)];
        return  nick;
    }
}
