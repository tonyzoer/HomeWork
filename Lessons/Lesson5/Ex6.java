import java.util.ArrayList;

/**
 * @author Alexandra
 * @since 07.11.2016, 16:46
 */
public class Ex6 {
    public static void main(String[] args) {
        //double brace
        ArrayList a = new ArrayList(){{
            add(10);
            add(20);
            add(30);
        }};

        //is equal to

        class NoName extends ArrayList{
            {
                super.add(10);
                super.add(20);
                super.add(30);
            }
        }

        ArrayList a1 = new NoName();
    }
}
