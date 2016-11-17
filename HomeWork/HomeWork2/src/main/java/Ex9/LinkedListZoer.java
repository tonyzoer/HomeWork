package Ex9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by mafio on 10.11.2016.
 */
public class LinkedListZoer {
    class ListElement {
        private ListElement next;

        private ListElement pred;
        private int data;
        public ListElement getPred() {
            return pred;
        }

        public void setPred(ListElement pred) {
            this.pred = pred;
        }


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
    ListElement first;
    ListElement last;
    public void push(int data,int pos){
        ListElement a = new ListElement();
        a.setData(data);
        if(first == null)
        {
            a.setNext(a);
            a.setPred(a);
            first = a;
            last = a;
        }
        else {
            ListElement t=first;
            for (int i = 0; i <pos ; i++)
            {
                t=t.getNext();
            }
            t.getPred().setNext(a);
            a.setPred(t.getPred());
            a.setNext(t);
            t.setPred(a);
        }
    }
    public ListElement pop (int pos){
        if (first==null){
            return null;
        }
        ListElement val;
        if (first==first.getNext()){
        val=first;
        first=null;
        }else{
            ListElement t=first;
            for (int i = 0; i <pos ||t.getNext().getNext()==first; i++)
            {
                t=t.getNext();
            }
            if (t==first){
            first=t.getNext();
            }
            t.getPred().setNext(t.getNext());
            t.getNext().setPred(t.getPred());
            val=t;

        }
        return val;
    }
    public List<Integer> thisToLinkedList(){
        List<Integer> l=new ArrayList<Integer>();
        ListElement a=first;
        if (first==null)
            return l;
        do {
            l.add(a.getData());
            a=a.getNext();
        }while (a!=first);
        return l;
    }
    public int indexOf(int data){
        if (first==null)
            return -1;
        ListElement a=first;
        int i=0;
        do {
            if (a.getData()==data){
                return i;
            }
            i++;
        a=a.getNext();
        }while(a!=first);

        return -1;
    }
    public boolean contains(int data){return indexOf(data)!=-1;}
    public List<Integer> toLinkedList(){
        List<Integer> list=new LinkedList<Integer>();
        ListElement l=first;
        do{
            list.add(l.data);
            l=l.getNext();
        }while (l!=first);
        return list;
    }

}
