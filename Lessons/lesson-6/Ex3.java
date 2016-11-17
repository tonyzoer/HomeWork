/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 16:08
 */
@FunctionalInterface
interface A2{
    void f();
}
class B2{
    static void g(){
        System.out.println("static g");
    }
}

public class Ex3 {
    public static void main(String[] args) {
        A2 pa = B2::g;
        pa.f();
    }
}
