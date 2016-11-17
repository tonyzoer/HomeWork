/**
 * @author Alexandra
 * @since 07.11.2016, 16:55
 */
class A7{
    int a7=4;
}
class B7 extends A7{
    class C{
        public void fc(){
            B7.this.a7 = 300;
        }
    }
}

public class Ex7 {
}
