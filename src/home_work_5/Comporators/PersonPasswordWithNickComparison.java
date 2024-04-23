package home_work_5.Comporators;

import home_work_5.Person;

import java.util.Comparator;

public class PersonPasswordWithNickComparison implements Comparator <Person> {
    @Override
    public int compare(Person pers1, Person pers2) {
        int result = Integer.compare(pers1.getPassword().length(), pers2.getPassword().length());
        if (result == 0) {
            result = pers1.getNick().compareTo(pers2.getNick());
        }
        return result;
    }
}
