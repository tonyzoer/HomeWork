/**
 * @author Alexandra
 * @since 07.11.2016, 16:38
 */
interface A5{
    void f();
}
public class Ex5 {
    public static void main(String[] args) {
        A5 pa = new A5() {
            @Override
            public void f() {
                System.out.println("Anon");
            }
        };

        //is equal to

        class NoName implements A5 {
            @Override
            public void f() {
                System.out.println("Anon");
            }
        }

        A5 pa1 = new NoName();
    }
}
