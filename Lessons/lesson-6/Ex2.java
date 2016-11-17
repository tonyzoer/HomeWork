/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 15:58
 */
@FunctionalInterface
interface A1{
    void f();
}
class B{
    void g(){
        System.out.println("g");
    }
    void g1(){
        System.out.println("g1");
    }
}
public class Ex2 {
    public static void main(String[] args) {
        B pb = new B();

        A1 pa = pb::g;
        pa.f();

        //is equal to

        class Noname implements A1{
            B pb;

            public Noname(B pb) {
                this.pb = pb;
            }

            @Override
            public void f() {
                pb.g();
            }
        }

        A1 pa1 = new Noname(pb);
        pa1.f();
    }
}
