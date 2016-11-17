/**
 * @author Alexandra
 * @since 07.11.2016, 15:54
 */
class A2{
    private int a;
    private static int aa;

    public void fa2(){
        B2 pb = this.new B2();
        pb.b = 5;
    }

    class B2{
        final static int c = 7;
        private int b;
       // private static int bb; //compilation error

        public void fb2(){
            A2.this.a = 7;
            B2.this.b = 4;
        }
    }
}

//error because there is no guarantee that A2 obj will exist
class C2 extends A2.B2{
    static A2 a2 = new A2();//only static
    //or a param to the constructor
    public C2() {
        a2.super();//for B2
    }
}
//non-static inner classes
public class Ex2 {
    public static void main(String[] args) {
        A2 pa = new A2();
        A2.B2 pb = pa.new B2();
    }
}
