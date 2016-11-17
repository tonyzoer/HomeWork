package epam1.ex1;
/*class C {}
class D extends C {
    public void g(){
    }
}
class A {
    public D f(){
        return new D();
    }
}
class B extends A{
    @Override
    public C f(){  // not C. Only D or extends D
        return new C();
    }
}*/
public class Example2 {
   /* public static A method(){
        return new B();  //we do not look at the method implementation
    }
    public static void main(String[] args) {
        A pa = method(); //we got B object BUT expect A?
        D pd = pa.f();
        pd.g();
    }*/
}
