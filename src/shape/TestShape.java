package shape;

/**
 * Created by eric on 5/8/16.
 */
public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Line line = new Line();
        doSomething(circle);
        doSomething(line);
    }

    public static void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
    }
}
