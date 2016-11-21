package structure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Maksym Dmytriiev
 * @since 18.11.16, 16:47
 */
public class Ex5 {
    public static void main(String[] args) {
        Operation o = new Proxy();
        System.out.println(o.sum(3, 4));
        System.out.println(o.sum(3, 5));
        System.out.println(o.sum(3, 4));
    }
}

interface Operation {
    int sum(int a, int b);
}

class RealObject implements Operation {

    public int sum(int a, int b) {
        System.out.println("REAL");
        return a + b;
    }
}

class Proxy implements Operation {
    RealObject object = new RealObject();
    List<Triple> cache = new ArrayList<>();

    public int sum(int a, int b) {
        for (Triple t: cache) {
            if (t.a == a && t.b == b) {
                System.out.println("PROXY");
                return t.res;
            }
        }
        int res = object.sum(a, b);

        Triple t = new Triple();
        t.a = a;
        t.b = b;
        t.res = res;

        cache.add(t);

        return res;
    }

    private static class Triple {
        int a;
        int b;
        int res;
    }
}

