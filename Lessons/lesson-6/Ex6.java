/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 16:49
 */
enum Colors{
    //final static is added automatically
    RED, WHITE, GREEN
}
public class Ex6 {
    public static void main(String[] args) {
        Colors green = Colors.GREEN;
        //ordinal - index
        System.out.println(green.ordinal());
        System.out.println(green.toString());//name
        System.out.println(Colors.valueOf("GREEN"));
    }
}
