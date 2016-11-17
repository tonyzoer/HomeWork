/**
 * Created by mafio on 11.11.2016.
 */

import Ex9.LinkedListZoer;
import junit.framework.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class Ex9Test {
    @Test
    public void linkListFullTest(){
        LinkedListZoer list1=new LinkedListZoer();
        list1.pop(6);
        list1.push(1,1);
        list1.push(3,4);
        list1.push(4,2);
        list1.pop(5);
        List<Integer> list11=list1.toLinkedList();
        LinkedList<Integer> list12=new LinkedList<Integer>();
        list12.add(1);
        list12.add(3);
        list12.add(4);
        list12.removeLast();
        Assert.assertEquals(list12,list11);
        Assert.assertEquals(true,list1.contains(3));
        Assert.assertEquals(false,list1.contains(2));
        Assert.assertEquals(0,list1.indexOf(1));
        Assert.assertEquals(-1,list1.indexOf(8));

    }

}
