package home_work_4;

import java.util.Arrays;

public class DataContainerMain {
    public static void main (String []agr) {
        String [] stringData;
        DataContainer<String> container = new DataContainer<>(new String[]{});
        int index1 = container.add("������");
        int index2 = container.add("��� ����");
        int index3 = container.add("�������");
        int index4 = container.add("����� �����");

        String text1 = container.get(index1);
        String text2 = container.get(index2);
        String text3 = container.get(index3);
        String text4 = container.get(index4);
        System.out.println(text1); //������
        System.out.println(text2); //��� ����
        System.out.println(text3); //�������
        System.out.println(text4); //����� �����
        container.delete(text1);
        System.out.println(container.get(index1));
        container.sort(new ComparatorRelisatorString()); //����������� �� ������
        System.out.println(container); // ["�������", "��� ����", "����� �����"]
        container.sort(new StringAlphabeticComparator()); //����������� �� ��������
        System.out.println(container); // ["����� �����", "��� ����", "�������"]

    }
}
