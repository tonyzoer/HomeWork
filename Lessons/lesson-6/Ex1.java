/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 15:39
 */
//functional interface (has 1 method)
@FunctionalInterface
interface A{
    int f(int a);
    default void b(){
        System.out.println("default");
    }
}
public class Ex1 {
    int c;
    A pa = (b)->{return b+c;};

    public static void main(String[] args) {
        //lambda function
    //    A pa = (b)->{return b;};
        Ex1 obj = new Ex1();
        System.out.println(obj.pa.f(5));
        System.out.println(obj.pa.getClass());

        //is equal to

        class Noname implements A {

            @Override
            public int f(int a) {
                //System.out.println("f");
                return a;
            }
        }

        A pa1 = new Noname();
        System.out.println(pa1.f(5));
    }
}
