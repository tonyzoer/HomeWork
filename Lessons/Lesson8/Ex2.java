import java.util.ArrayList;
import java.util.List;

/**
 * @author Maksym Dmytriiev
 * @since 14.11.16, 15:58
 */
public class Ex2 {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        //List<Number> n = (List<Number>) l;
        List ll = new ArrayList<>();//anything can be put
        ll.add(10);
        ll.add("gfdgdf");

        System.out.println(ll);


    }
}
