/**
 * @author Maksym Dmytriiev
 * @since 14.11.16, 15:45
 */
class A<T>{
    //T [] a =(T[]) new Object[10];
    T [] a;
   // T [] aa =new T[10]; //compilation error

    public A(T[] a) {
        this.a = a;
    }
}
public class Ex1 {
}
