package epam1.ex1;

import java.util.ArrayList;
import java.util.List;

//масштабируемость кода, проекта. (паттерн - bridge (мост)) отделение абстр от реализации
class Set extends Object {     //1st team implements it
    Container c;
    public Set(Container c) {
        this.c = c;
    }

    //TODO: HM
    public Set union(Set other){
        Set result = new Set(this.c.clone());
        for (int i = 0; i < other.c.size(); i++) {
            int element = other.c.get(i);
            if(!result.c.contains(element)){
                result.c.add(element);
            }
        }
        return result;
    }
}

interface Container extends Cloneable {  //two teams should discuss only these methods
    Container clone();
    int size();
    int get(int index);
    boolean contains(int element);
    void add(int element);
}

class ArrayContainer implements Container{ //team 2 //pattern - adapter
    List<Integer> l = new ArrayList<>();

    //TODO: HM next week(2) do not use own implementation. use ready.
    @Override
    public Container clone() {  //pattern 3 prototype is here - how to copy the object
        ArrayContainer copy = new ArrayContainer();
        for (int i = 0; i < l.size(); i++) {
            copy.l.add(l.get(i));
        }
        return copy;
    }
    @Override
    public int size() {
        return l.size();
    }
    @Override
    public int get(int index) {
        return l.get(index);
    }
    @Override
    public boolean contains(int element) {
        return l.contains(element);
    }
    @Override
    public void add(int element) {
        l.add(element);
    }
}

public class InterfaceExample4 {
}
