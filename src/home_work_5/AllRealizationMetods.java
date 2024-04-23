package home_work_5;

import home_work_5.GeneratorsRandom.RandomNameGenerator;
import home_work_5.GeneratorsRandom.RandomNickGenerator;

import java.util.Collection;
import java.util.Iterator;

public class AllRealizationMetods {

    //Наполнение коллекций.
    public static void  allAddCollection (Collection collection){
        long start = System.currentTimeMillis();
        int randomNumberNeed = 1_000_000;
        for (int i = 0; i < randomNumberNeed; i++) {
            collection.add(new Person(new RandomNickGenerator().generatorRandomRusNick(10),"привети123", RandomNameGenerator.geterateRandomRealName()));
        }
        long stop = System.currentTimeMillis();
        System.out.println("Операция добавление "+collection.getClass().getName()+" = "+ (stop-start) + " мс");
    }
    //Удаление элементов коллекций.
    public static void  allDeleteIteratorCollection (Collection collection){
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
    public static void  allIteratorCollection (Collection collection){
        Iterator<Person> iterator = collection.iterator();
        long start = System.currentTimeMillis();
        while (iterator.hasNext()){
            iterator.next();
        }
        long stop = System.currentTimeMillis();
        System.out.println("Итерирование занимает  = "+collection.getClass().getName()+" = "+ (stop-start) + " мс");
    }
    // Итерирование через For.
    public static void  allIteratorAnyVariantCollection (Collection collection){
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < collection.size(); i++) {
            count++;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Итерирование через For занимает = "+collection.getClass().getName()+" = "+ (stop-start) + " мс");
    }
}
