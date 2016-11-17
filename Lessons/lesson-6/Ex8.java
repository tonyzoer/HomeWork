/**
 * @author Maksym Dmytriiev
 * @since 09.11.16, 17:03
 */
enum Operations{

    //these methods inherit Operations
    PLUS{
        int c = 100;
        public int operation(int a, int b){
            return a+b+c;
        }
    },
    MINUS{
        public int operation(int a, int b){
            return a-b;
        }
    };

    static {
        //runs after constructor
    }

    //even final static goes after
    final static int myconst = 77;

    public abstract int operation(int a,int b);
}
public class Ex8 {
    public static void main(String[] args) {
        for(Operations elem : Operations.values()){
            System.out.println(elem.operation(10,20));
        }
    }
}
