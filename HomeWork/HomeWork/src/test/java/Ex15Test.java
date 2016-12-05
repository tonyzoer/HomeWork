import Ex15.PriorityQueue;
import junit.framework.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by mafio on 18.11.2016.
 */
public class Ex15Test {
    @Test
    public void priorityQueueHeapSortTest(){
        List<Integer> list=new LinkedList<>();
        list.add(34);
        list.add(312);list.add(734);list.add(314);list.add(234);list.add(734);
        list.add(341);list.add(934);list.add(344);list.add(354);list.add(364);
        list.add(374);list.add(134);list.add(234);list.add(834);list.add(534);
        PriorityQueue<Integer> queue=new PriorityQueue<>(list);
        list.sort((o1,o2)->o2.intValue()-o1.intValue());
        Assert.assertEquals(list,queue.heapSort());
    }
    @Test
    public void addTest(){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(6);
        pq.add(9);
        pq.add(19);
        pq.add(29);
        pq.add(39);
        pq.add(94);
        pq.add(95);
        pq.add(96);
        List<Integer> list=new LinkedList<>();
        list.add(6);
        list.add(9);
        list.add(19);
        list.add(29);
        list.add(39);
        list.add(94);
        list.add(95);
        list.add(96);
        list.sort((o1,o2)->o2.intValue()-o1.intValue());
        int i=0;
        while (pq.getHeapSize()!=0){
        Assert.assertEquals(list.get(i),pq.getMax());
           i++;
        }
    }
    @Test
    public void getNull(){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        Assert.assertEquals(null,pq.getMax());
    }
}
