import java.util.function.Function;

/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 17:21
 */
public class Ex9 {
    public static void main(String[] args) {
        Function<Integer,String> f = (a)->{return a.toString();};
        String s = f.apply(4);
        System.out.println(s);
    }
}
