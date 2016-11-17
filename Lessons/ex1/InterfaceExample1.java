package epam1.ex1;
interface A {
public static final
 int a = 10;
public abstract
     void f1();
public
      default void f2(){}
public
  static void f3(){}
    // functional interface - has only 1 abstract method.
    // BUT plus any amount of default or static
}
class B implements A { //,C, B, F any amount. Imitation of mnojistvinoe inheritance
    @Override
    public void f1() {
    }
//    @Override // if you want you can override
//    public void f2() {
//    }
    //f3 cannot be overrode
}

public class InterfaceExample1 {
}
