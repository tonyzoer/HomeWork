package structure;

/**
 * @author Maksym Dmytriiev
 * @since 18.11.16, 17:04
 */

interface Component {
    int operation();
}

class PlusOperation implements Component{
    Component left;
    Component right;

    public PlusOperation(Component left, Component right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int operation() {
        return left.operation() + right.operation();
    }
}

class MultOperation implements Component{
    Component left;
    Component right;

    public MultOperation(Component left, Component right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int operation() {
        return left.operation() * right.operation();
    }
}
class DivisionOperation implements Component{
    Component left;
    Component right;

    public DivisionOperation(Component left, Component right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int operation() {
        return left.operation() / right.operation();
    }
}

class Leaf implements Component {
    int value;

    public Leaf(int value) {
        this.value = value;
    }

    @Override
    public int operation() {
        return value;
    }
}

public class Ex6 {
    public static void main(String[] args) {
        Component one = new Leaf(1);
        Component two = new Leaf(2);

        Component plus1 = new PlusOperation(one, two);

        Component three = new Leaf(3);
        Component mult1 = new MultOperation(plus1, three);

        Component four = new Leaf(4);
        Component five = new Leaf(5);

        Component mult2 = new MultOperation(four, five);

        Component plus2 = new PlusOperation(mult1, mult2);

        System.out.println(plus2.operation());
    }
}
