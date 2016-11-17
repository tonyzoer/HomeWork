package Ex8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mafio on 09.11.2016.
 */
public class ListZoer {
    class ListElement {
        private ListElement next;

        private int data;

        public ListElement getNext() {
            return next;
        }

        public void setNext(ListElement next) {
            this.next = next;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }
    }

    private ListElement head;
    private ListElement tail;
    public static List<Integer> intArrayListToList(ListZoer arr){
        List<Integer> l=new ArrayList<Integer>();
        ListElement t=arr.head;
        while (t!=null) {
            l.add(t.getData());
            t = t.getNext();
        }

        return l;
    }

   public void addFront(int data){
        ListElement a = new ListElement();
        a.setData(data);

        if(head == null)
        {
            head = a;
            tail = a;
        }
        else {
            a.setNext(head);
            head = a;
        }
    }

    public void addBack(int data) {
        ListElement a = new ListElement();
        a.setData(data);
        if (tail == null)
        {
            head = a;
            tail = a;
        } else {
            tail.setNext(a);
            tail = a;
        }
    }

    public List<Integer> getList()
    {
        return intArrayListToList(this);
    }

    public void delEl(int data){
        if(head == null)
            return;

        if (head == tail) {
            head = null;
            tail = null;
            return;
        }

        if (head.getData() == data) {
            head = head.getNext();
            return;
        }

        ListElement t = head;
        while (t.getNext() != null) {
            if (t.getNext().getData() == data) {
                if(tail == t.getNext())
                {
                    tail = t;
                }
                t.setNext(t.getNext().getNext());
                return;
            }
            t = t.getNext();
        }
    }

}
