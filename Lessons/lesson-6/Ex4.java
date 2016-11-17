import java.util.Optional;
import java.util.function.Supplier;

/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 16:14
 */
class B4{
    Optional<String> name= Optional.empty();
    String name1;

    public void setName(String name){
        //of - null can be passed
        this.name = Optional.ofNullable(this.name.orElse(name));

        //is equal to

        if (this.name.get() != null){
            this.name = Optional.of(name);
        }

        this.name.orElseThrow(RuntimeException::new);


        //is equal to
       /* if (name!=null){
            this.name1 = name;
        }*/

    }
}

public class Ex4 {
    public static void main(String[] args) {
        B4 pb = new B4();
        pb.setName("name");
    }
}
