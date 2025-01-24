package Main;

public class Composition {
    public static void main(String[] args) {
        
        // Composition = Represents a "part-of" relationship between objects. For example, an Engine is "part of " a car. Allows complex objects to be constructed from smaller objects.

        Car car = new Car("Ford", "Mustang", 1999, "red", 100000, "V8");

        System.out.println(car.engine.type);
        car.engine.start();
    }
}
