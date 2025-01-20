package Main;

public class TwoString {
    public static void main(String[] args) {
        
        // .toString() = Method inherited from the Object class. Used to return a string representation of an object. By default, it returns a had code as a unique identifier. It can be overridden to provide meaningful details.

        Car car1 = new Car("Ford", "Mustang", 2024, "Red");
        Car car2 = new Car("Dodge", "Charger", 2023, "Black");

        System.out.println(car1);
        System.out.println(car2);

    }
}
