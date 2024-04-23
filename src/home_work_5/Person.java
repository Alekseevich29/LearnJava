package home_work_5;

import java.util.Random;

public class Person {
    private String nick;
    private String password;
    private String name;

    public Person(String nick, String password, String name) {
        this.nick = nick;
        setPassword(password);
        this.name = name;
    }
    public String getPassword() {
        return password;
    }


    public String getNick() {
        return nick;
    }

    public String getName() {
        return name;
    }


    public void setPassword(String password) {
        if (password.length() >= 5 && password.length() <= 10 ){
            this.password = password;
        }else {
            throw new IllegalArgumentException ("������ ������ ���� �� 5 �� 10 ��������.");
        }
    }

    public String toString() {
        return  "Person { ��� = "+ name +" ��������� = "+ nick + " ������ = "+ password +" }";
    }

}
