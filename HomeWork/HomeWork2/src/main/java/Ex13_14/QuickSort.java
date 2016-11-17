package Ex13_14;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


/**
 * Created by mafio on 14.11.2016.
 */
public class QuickSort{


    private QuickSort() {
        //==)
    }

    public static <T> List<T> quicksort(List<T> v, BiFunction<T, T, Integer> comparer)
    {
        if (v.size() < 2)
            return v;

        T pivot = v.get(v.size() / 2);

        List<T> l = new LinkedList<>(quicksort(v.stream().filter(x -> comparer.apply(x, pivot) < 0).collect(Collectors.toList()), comparer));
        l.addAll( v.stream().filter(x -> comparer.apply(x, pivot) == 0).collect(Collectors.toList()) );
        l.addAll( quicksort(v.stream().filter(x -> comparer.apply(x, pivot) > 0).collect(Collectors.toList()), comparer) );


        return l;
    }
    public static <T> List<T> concatSort(List<T> z,List<T> v, BiFunction<T, T, Integer> comparer){
        List<T> l=new LinkedList<>();
        for (T t:z)
        {
            l.add(t);
        }
        for (T t:v)
        {
            l.add(t);
        }
        return quicksort(l,comparer);
    }

}
