/**
 * @author Maksym Dmytriiev
 * @since 14.11.16, 16:05
 */
class MyDividedByZero extends RuntimeException{

}
class A1{
    public int divided(int a, int b){
        int c = 0;


            if (b == 0) {
                throw new MyDividedByZero();
            }
            c = a / b;


        return c;
    }
}
public class Ex3 {
    //Throwable  <- Error (unchecked)
    //           <- Exception(checked) <- Runtime (unchecked)
    public static void main(String[] args) {
        //exceptions
        A1 pa = new A1();
        try {
            pa.divided(7, 20);
        }finally {

        }
        /*try{
            pa.divided(7,20);
        }
        catch (MyDividedByZero e){
            System.out.println(e);
        }*/
    }
}
