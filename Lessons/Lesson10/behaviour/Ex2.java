/**
 * @author Maksym Dmytriiev
 * @since 18.11.16, 16:15
 */

class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {}

    public static /*synchronized*/ LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }

        return instance;
    }
}

class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}

    public static Singleton getInstance() {
        return instance;
    }
}

public class Ex2 {
}
