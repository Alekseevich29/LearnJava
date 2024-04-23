package home_work_5;

import home_work_5.GeneratorsRandom.RandomNameGenerator;
import home_work_5.GeneratorsRandom.RandomNickGenerator;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class AllRealizationMetods <T> {

    //Наполнение коллекций.
    public static void  allAddCollection (Collection <Person>collection){
        long start = System.currentTimeMillis();
        int randomNumberNeed = 1_000_000;
        for (int i = 0; i < randomNumberNeed; i++) {
            collection.add(new Person(new RandomNickGenerator().generatorRandomRusNick(10),"привети123", RandomNameGenerator.geterateRandomRealName()));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция добавление "+collection.getClass().getName()+" = "+ (stop-start) + " мс");
    }
    //Удаление элементов коллекций.
    public static void  allDeleteIteratorCollection (Collection <Person> collection){
        long start = System.currentTimeMillis();
        Iterator<Person> iterator = collection.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция Удаления Iterator  = "+collection.getClass().getName()+" = "+ (stop-start) + " мс");
    }
        // Удаление через removeAll.
   /* public static void  allDeleteForCollection (Collection collection){
        long start = System.currentTimeMillis();
        Collection <Person> people = collection;
        collection.removeAll(people);
        long stop = System.currentTimeMillis();
        System.out.println("Операция Удаления removeAll  = "+collection.getClass().getName()+" = "+ (stop-start) + " мс");
    }*/
    // Итерирование через итератор
    public static void  allIteratorCollection (Collection <Person> collection){
        Iterator<Person> iterator = collection.iterator();
        long start = System.currentTimeMillis();
        while (iterator.hasNext()){
            iterator.next();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Итерирование занимает  = "+collection.getClass().getName()+" = "+ (stop-start) + " мс");
    }
    // Итерирование через For.
    public static void  allIteratorAnyVariantCollection (Collection <Person> collection){
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < collection.size(); i++) {
            count++;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Итерирование через For занимает = "+collection.getClass().getName()+" = "+ (stop-start) + " мс");
    }

    // моя сортировка 6.3.2.* Сортируем собственным методом сортировки
    // только для List.
    public static void sortMyList (Comparator<Person> comparator, List<Person> collection) {
        for (int i = 0; i < collection.size() - 1; i++) {
            for (int j = 0; j < collection.size() - i - 1; j++) {
                if (comparator.compare(collection.get(i), collection.get(j + 1)) > 0) {
                    Person temp = collection.get(j);
                    collection.set(j, collection.get(j + 1));
                    collection.set(j + 1, temp);
                }

            }
        }
    }
}
