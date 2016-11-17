import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 16:35
 */
class B5{
    Optional<String> name;

    public void setName(String newName){
        name = Optional.of(newName);
        //is equal to
        //name = newName;

        name = Optional.ofNullable(newName);
        //is equal to
        /*
        if (newName !=null){
            name = Optional.of(newName);
        }*/

        String nm = name.orElse(newName);
        //is equal to
        /*String nm = null;
        if (newName != null){
            nm = newName;
        }
        */

        class Noname implements Supplier<RuntimeException>{

            @Override
            public RuntimeException get() {
                return new RuntimeException();
            }
        }
        Supplier<RuntimeException> sp = new Noname();
        String nm1 = name.orElseThrow(sp);

        //is equal to
        /*if (name == null){
            throw new RuntimeException();
        }*/

        boolean isPresent = name.isPresent();
        //is equal to
        //isPresent = !(name == null);

        class Noname1 implements Consumer<String>{

            @Override
            public void accept(String s) {
                System.out.println("name is not null!");
            }
        }
        Consumer<String> con = new Noname1();
        name.ifPresent(con);


    }
}

public class Ex5 {
    public static void main(String[] args) {

    }
}
