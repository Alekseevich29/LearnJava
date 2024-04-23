package home_work_5.Comporators;

import home_work_5.Animal;

import java.util.Comparator;

public class AnimalAgeComparison implements Comparator <Animal> {
    @Override
    public int compare(Animal animal1, Animal animal2) {
        return Integer.compare(animal1.getAge(), animal2.getAge());
    }
}
