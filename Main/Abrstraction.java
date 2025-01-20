package Main;

public class Abrstraction {
    public static void main(String[] args) {
        // abstract = Used to define abstract classes and methods. Abstraction is the process of hiding implementation details and showing only the essential features; Abstract classes can't be instantiated directly. Can contain abstract methods (which must be implemented). Can contain concrete methods (which are inherited)

        // Shape shape = new Shape();
        Circle circle = new Circle(2.0);
        Triangle triangle = new Triangle(5.0, 4.0);
        Rectangle rectangle = new Rectangle(3.0,2.0);

        // circle.display();
        // triangle.display();
        // rectangle.display();

        System.err.println(circle.area());
        System.err.println(triangle.area());
        System.err.println(rectangle.area());
    }
}
