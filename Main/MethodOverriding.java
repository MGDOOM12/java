package Main;

public class MethodOverriding {
    public static void main(String[] args) {
        // Method overriding = When a subclass provides its own implementation of a method that is already defined. Allows for code reusability and give specific implementations.

        Dog dog = new Dog();
        Shark shark = new Shark();

        dog.move();
        shark.move();
    }
}
