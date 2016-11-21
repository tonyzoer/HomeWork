/**
 * @author Maksym Dmytriiev
 * @since 18.11.16, 15:47
 */
enum Color {
    BLACK,
    WHITE
}

abstract class ShapeFactory{

    public abstract Shape make(Color color);

}

class TriangleFactory extends ShapeFactory {
    private static final TriangleFactory instance = new TriangleFactory();
    public static TriangleFactory getInstance() {return instance;}

    private TriangleFactory() {}

    public Triangle make(Color color) {
        if (color == Color.WHITE) {
            return new WhiteTriangle();
        } else if (color == Color.BLACK) {
            return new BlackTriangle();
        }
        throw new IllegalArgumentException();
    }
}

class CircleFactory extends ShapeFactory {
    private static final CircleFactory instance = new CircleFactory();
    public static CircleFactory getInstance() {return instance;}

    private CircleFactory() {}

    public Circle make(Color color) {
        if (color == Color.WHITE) {
            return new WhiteCircle();
        } else if (color == Color.BLACK) {
            return new BlackCircle();
        }
        throw new IllegalArgumentException();
    }
}

abstract class Shape{
    //some fields;

    public abstract void show();
}
abstract class Triangle extends Shape{
}
class BlackTriangle extends Triangle{

    public void show() {
        System.out.println("Black Triangle");
    }
}
class WhiteTriangle extends Triangle{

    public void show() {
        System.out.println("White Triangle");
    }
}

abstract class Circle extends Shape{
}
class BlackCircle extends Circle{
    public void show() {
        System.out.println("Black Circle");
    }
}
class WhiteCircle extends Circle{
    public void show() {
        System.out.println("White Circle");
    }
}

public class Ex1 {
    public static void main(String[] args) {
        ShapeFactory factory = TriangleFactory.getInstance();
        Shape shape = factory.make(Color.BLACK);

        shape.show();
    }
}
