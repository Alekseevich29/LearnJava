package home_work_4;


import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;


public class ComparatorRelisatorInteger implements Comparator<Integer> {


    @Override
    public int compare(Integer o1, Integer o2) {
        return o1-o2;
    }

}
