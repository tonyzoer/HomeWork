/**
 * @author Alexandra
 * @since 07.11.2016, 16:27
 */
interface A4{
    void fB();
}
//local classes
public class Ex4 {
    static int a;
    int aa;

    public  A4 method(){
        int c = 100;
        //c = 200;
        class B implements A4{
            //no static fields allowed
            int b;

            public void fB(){
                b = 100;
                a = 8; //access only to static fields if the method is static
                aa = c;
                //c = 8; //compilation error; no access to local fields
                //unless it's final

            }
        }

        B pb = new B();
        return pb;
    }
    public static void main(String[] args) {

    }
}
