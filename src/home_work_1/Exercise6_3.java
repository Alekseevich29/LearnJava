package home_work_1;

import java.util.Scanner;

public class Exercise6_3 implements ICommunicationPrinter{

    public  String welcom (String name){
        switch (name){
            case "����":
                return "������ � ���� ��� ����� ����";
            case "���������":
                return "� ���� ��� ����� ����";
            default:return "������ ����, � �� ���?";
        }
    }
}
