package Main;

public class Inheritance {
    public static void main(String[] args) {
        // Inheritance = one class inherits the attributes and methods from another class
        //               Child <- Parent

        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.bark();
        cat.meow();
    }
}
