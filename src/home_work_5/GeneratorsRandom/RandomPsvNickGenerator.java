package home_work_5.GeneratorsRandom;

import java.util.Random;

public class RandomPsvNickGenerator {

    public String generatorRandomPsevdo(int needLenght) {
        String nick;
        Random rndFirst  = new Random();
        nick = rndFirst.ints(32,255)
                .limit(needLenght)
                .collect(StringBuilder:: new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
        return nick;
    }

    public String generatorRandomEngPsevdo(int needLenght) {
        String nick;
        Random rndFirst  = new Random();
        nick = rndFirst.ints(65,122)
                .limit(needLenght)
                .collect(StringBuilder:: new, StringBuilder::appendCodePoint,StringBuilder::append)
                .toString();
        return nick;
    }
}
