/**
 * @author Maksym Dmytriiev
 * @since 14.11.16, 16:55
 */
class A5{
    static A5 pa;

    int a;
    /*
    public static A5 create(int i) throws Exception {
        // Logic goes here
        return new A5(i);
    }
    */
    public A5(int a) throws Exception{
        pa = this; // Stores reference to created object in PG
        if (a == 0){
            throw new Exception();
        }
        this.a = a;
    }
}
public class Ex5 {
    public static void main(String[] args) {
        A5 pa5 = null;
        try {
            pa5 = new A5(0);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println(pa5);
        System.out.println(A5.pa);
    }
}
