/**
 * @author Alexandra
 * @since 07.11.2016, 15:32
 */

class A{
    private int a;
    private static int aa;

    //is not loaded before fb() is called
    static {
        System.out.println("here");
    }

    class C1 {
        public void fc(){
            A.aa=4;
            B.bb =7;
        }

        public void fc1(){
            B pb = new B();
            pb.b = 7;
        }
    }

    //private, protected, public, package
    static class B{
        //static means that u can't use this of class A
        private int b;
        private static int bb;

        public void fb(){
            //u may access private fields
            //no access to non-static fields
            A pa = new A();
            pa.a = 100;
            //a = 100; - compilation error
            aa = 100;
        }
    }

    public void fa(){
        //u may access private fields
        B.bb = 40;
        B pb = new B();
        pb.b = 404;
    }
}

//can't access private fields of class A
class C extends A.B{
    public void fc(){
        //A.aa=4; compilation error
    }
}

//nested classes (static inner classes)
public class Ex1 {

    public static void main(String[] args) {
        A.B pbb = new A.B();
        pbb.fb();
    }
}
