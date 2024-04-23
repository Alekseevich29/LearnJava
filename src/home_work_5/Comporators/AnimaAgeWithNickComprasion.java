package home_work_5.Comporators;

import home_work_5.Animal;

import java.util.Comparator;

public class AnimaAgeWithNickComprasion implements Comparator <Animal> {

    @Override
    public int compare(Animal anima1, Animal anima2) {
        int result = Integer.compare(anima1.getAge(),anima2.getAge());
        if (result == 0){
            result =  anima1.getNick().compareTo(anima2.getNick());
        }
        return  result;
    }
}
