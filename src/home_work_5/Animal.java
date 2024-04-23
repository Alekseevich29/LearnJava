package home_work_5;

import java.util.Random;

public class Animal {

    private int age;
    private String nick;

    public void setAge(int age) {
        if (age >1 && age<15){
        this.age = age;
        }else throw new IllegalArgumentException ("Возраст должен быть от 1 до 15 лет.");
    }

    public int getAge() {
        return age;
    }

    public String getNick() {
        return nick;
    }

    public String toString() {
        return  "Animal { nick = "+ nick + " age = "+ age +" }";
    }

}
