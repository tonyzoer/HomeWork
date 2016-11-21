/**
 * @author Maksym Dmytriiev
 * @since 18.11.16, 16:41
 */

class MyObject {
    int a;

    private MyObject(int a) {
        this.a = a;
    }

    public static MyObject create(int a) {

        if (a == 3) {
            throw new IllegalArgumentException("A cannot be 3!");
        }

        return new MyObject(a);
    }
}

public class Ex4 {
    public static void main(String[] args) {
        MyObject obj = MyObject.create(5);
        System.out.println(obj.a);
    }
}
