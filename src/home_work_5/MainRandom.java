package home_work_5;

import home_work_5.Comporators.PersonPasswordWithNickComparison;
import home_work_5.GeneratorsRandom.RandomNickGenerator;
import home_work_5.GeneratorsRandom.RandomNameGenerator;

import java.util.*;

public class MainRandom {
    public static void main(String[] args) {

        LinkedList<Person> personLinkedList =  new LinkedList<>();
        ArrayList<Person> personArrayList = new ArrayList<>();
        HashSet<Person> personHashSet = new HashSet<>();
        TreeSet <Person> personTreeSet = new TreeSet<>(new PersonPasswordWithNickComparison());
        ///���������� � �������� � ������� �������
        AllRealizationMetods.allAddCollection(personLinkedList);
        AllRealizationMetods.allIteratorCollection(personLinkedList);
        AllRealizationMetods.allIteratorAnyVariantCollection(personLinkedList);
        // ����������
        personLinkedList.sort(new PersonPasswordWithNickComparison());

        AllRealizationMetods.allDeleteIteratorCollection(personLinkedList);

        AllRealizationMetods.allAddCollection(personArrayList);
        AllRealizationMetods.allIteratorCollection(personArrayList);
        AllRealizationMetods.allIteratorAnyVariantCollection(personArrayList);
        // ����������
        personArrayList.sort(new PersonPasswordWithNickComparison());

        AllRealizationMetods.allDeleteIteratorCollection(personArrayList);

        AllRealizationMetods.allAddCollection(personHashSet);
        AllRealizationMetods.allIteratorCollection(personHashSet);
        AllRealizationMetods.allIteratorAnyVariantCollection(personHashSet);
        // ����������
        List <Person> sortHashSet = new ArrayList<>(personHashSet);
        sortHashSet.sort(new PersonPasswordWithNickComparison());

        AllRealizationMetods.allDeleteIteratorCollection(personHashSet);


        AllRealizationMetods.allAddCollection(personTreeSet);
        AllRealizationMetods.allIteratorCollection(personTreeSet);
        AllRealizationMetods.allIteratorAnyVariantCollection(personTreeSet);
        // ����������
        List <Person> clonTreeSet = new ArrayList<>(personTreeSet);
        clonTreeSet.sort(new PersonPasswordWithNickComparison());

        AllRealizationMetods.allDeleteIteratorCollection(personTreeSet);

    }
}
