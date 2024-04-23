package home_work_5.Comporators;

import home_work_5.Person;

import java.util.Comparator;

public class PersonPasswordComparison implements Comparator<Person> {
    @Override
    public int compare(Person pers1, Person pers2) {
        return Integer.compare(pers1.getPassword().length(), pers2.getPassword().length());
    }
}
