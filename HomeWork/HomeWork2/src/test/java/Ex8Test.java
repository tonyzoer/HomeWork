/**
 * Created by mafio on 11.11.2016.
 */

import Ex8.ListZoer;
import junit.framework.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Ex8Test {
    @Test
    public void listTest(){
    ListZoer listZoer =new ListZoer();
        listZoer.delEl(5);
        listZoer.addBack(1);
        listZoer.addFront(2);
        listZoer.addBack(3);
        listZoer.addFront(4); //4 2 1 3;
        ListZoer listZoer2 =new ListZoer();
        listZoer2.addBack(1);
        listZoer2.addFront(2);
        listZoer2.addBack(3);
        listZoer2.addFront(4); //4 2 1 3;
        List<Integer> l1= ListZoer.intArrayListToList(listZoer);
        listZoer.delEl(1);
        l1.remove(2);
        List<Integer> l3= ListZoer.intArrayListToList(listZoer);
        Assert.assertEquals(l1,l3);
    }
    @Test
    public void delTest(){
        ListZoer listZoer =new ListZoer();
        listZoer.addBack(1);
        listZoer.addFront(2);
        listZoer.addBack(3);
        listZoer.addFront(4); //4 2 1 3;
        listZoer.delEl(3);
        listZoer.delEl(9);
        List<Integer>l1=ListZoer.intArrayListToList(listZoer);
        List<Integer>l2=new ArrayList<Integer>();
        l2.add(4);
        l2.add(2);
        l2.add(1);
        Assert.assertEquals(l1,l2);
    }
}
