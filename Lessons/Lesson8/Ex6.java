/**
 * @author Maksym Dmytriiev
 * @since 14.11.16, 17:05
 */
class A6 {
    int a;

    public static A6 create(int a) {
        if (a == 0) {
            throw new IllegalArgumentException("A == 0");
        }
        A6 a6 = new A6(a);
        a6.init();
        return a6;
    }

    /*protected */A6(int a) {
        this.a = a;
    }

    public void init() {
        System.out.println("Init");
    }
}

class A6Factory {
    private static final A6Factory instance = new A6Factory();

    public static A6 getA6(int a) {
        if (a == 0) {
            throw new IllegalArgumentException("A == 0");
        }
        A6 a6 = new A6(a);
        a6.init();
        return a6;
    }

    private A6Factory() {}

    public static A6Factory getInstance() {
        return instance;
    }
}

public class Ex6 {
    public static void main(String[] args) {

    }
}
