import Ex13_14.QuickSort;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Created by mafio on 15.11.2016.
 */
public class Ex13_14Test {
    @Test
    public void qucikSortTest(){
        BiFunction<Integer,Integer,Integer> intComparer=(num1, num2)->num1-num2;
        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(7);
        list.sort((o1,o2)->o1.intValue()-o2.intValue());
        List<Integer> list2=new LinkedList<>();
        list2= QuickSort.quicksort(list,intComparer);
        Assert.assertEquals(list, list2);
    }
    @Test
    public void concatTest(){
        BiFunction<Integer,Integer,Integer> intComparer=(num1, num2)->num1-num2;
        List<Integer> list=new ArrayList<>();
        list.add(7);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(5);
        list.add(8);
        list.add(7);
        List<Integer> list2=new ArrayList<>();
        list2.add(7);
        list2.add(6);
        list2.add(9);
        list2.add(1);
        list2.add(5);
        list2.add(8);
        list2.add(7);
        List<Integer> list3=new LinkedList<>(list);
       list3.addAll(list2);
        list3.sort((o1,o2)->o1.intValue()-o2.intValue());
        Assert.assertEquals(list3, QuickSort.concatSort(list,list2,intComparer));
    }
}
