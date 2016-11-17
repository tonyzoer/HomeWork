/**
 * @author Maksym Dmytriiev
 * @since 14.11.16, 16:40
 */
class NewMyException extends Exception{
    public NewMyException(Exception e) {
        super(e);
    }
}
class MyException extends Exception{

}

class A4 {
    public int divided(int a, int b) throws NewMyException{
        int c = 0;
        try{
            if (b == 0) {
                throw new MyException();
            }
            c = a / b;

        }catch (MyException e){
            throw new NewMyException(e);
        }

        return c;
    }
}
public class Ex4 {
    public static void main(String[] args) {
        A4 pa = new A4();
        try {
            pa.divided(7, 0);
        }
        catch (NewMyException e){
            e.printStackTrace();
        }
    }
}
