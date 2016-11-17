/**
 * @author Alexandra
 * @since 07.11.2016, 16:21
 */
interface A3{
    B pb = new B(); //final static
    class B{
        public int x;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        A3.pb.x = 5;
    }
}
