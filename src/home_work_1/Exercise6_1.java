package home_work_1;

import java.util.Scanner;

public class Exercise6_1 implements ICommunicationPrinter{

    @Override
    public String welcom (String name) {
        if (name.equals("����")){
            return "������ � ���� ��� ����� ����";
        }
        if(name.equals("���������")){
            return "� ���� ��� ����� ����";
        } else return "������ ����, � �� ���?";
    }



}
