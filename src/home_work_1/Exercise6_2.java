package home_work_1;

import java.util.Scanner;

public class Exercise6_2 implements ICommunicationPrinter{

       public  String welcom (String name) {
        if (name.equals("����")) {
            return "������ � ���� ��� ����� ����";
        }else if(name.equals("���������")) {
            return "� ���� ��� ����� ����";
        }else { return"������ ����, � �� ���?";}
    }
}
