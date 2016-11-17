package epam1.ex1;
class A {
    int value;

    @Override
    //TODO: add the class check  (o has the type A) and is not null
    public boolean equals(Object o){
        return this.value == ((A) o).value;
    }

    @Override
    public int hashCode(){
        return value;  //return 1 is correct implementation. now well but correct
    }
}
class B {
    int value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        B b = (B) o;
        return value == b.value;
    }
    @Override
    public int hashCode() {
        return value;
    }
}
class C {
    int value;
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof C)) return false;
        C c = (C) o;
        return value == c.value;
    }
    @Override
    public int hashCode() {
        return value;
    }
}

public class EqualsHashCodeExample1 {
    public static void main(String[] args) {
        A pa1 = new A();
        A pa2 = new A();
        System.out.println(pa1.equals(pa2));

    }
}
