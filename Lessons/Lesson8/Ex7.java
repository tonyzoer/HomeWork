/**
 * @author Maksym Dmytriiev
 * @since 14.11.16, 17:15
 */
class MyException7 extends MyException {

}
class MyException8 extends MyException {

}

class A7 {
    public void f() throws MyException7, MyException8 {
        System.out.println("F");
        throw new MyException7();
    }
}

class B7 extends A7 {
    @Override
    public void f() { //throws MyException7{//, Exception { - forbidden to throw, we don't know anything about Exception in A7
        System.out.println("F");
        //throw new MyException7();
    }
}

public class Ex7 {
    static A7 method() {
        return new B7();
    }
    public static void main(String[] args) {
        A7 pa7 = method();
        try {
            pa7.f();
        } catch (MyException7 e) {

        } catch (MyException8 e) {

        }
    }
}
