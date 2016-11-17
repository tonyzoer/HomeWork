/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 16:55
 */
enum Colors1{
    //int tt; compilation error, enumerations should go first
    RED(10,"red"), BLUE(20,"blue"), GREEN(30,"green");

    static int b=7;
    int a;
    String str;

    private Colors1(int a, String str){
        this.a = a;
        this.str = str;
        //this.b=100; compilation error
    }

    public void setB(){
        b = 77;
        this.b=7;
    }

    public String getStr(){
        return str;
    }

    public int getA(){
        return a;
    }
}
public class Ex7 {
    public static void main(String[] args) {
        Colors1 c = Colors1.BLUE;
        System.out.println(c.getA());
        System.out.println(c.getStr());
    }
}
