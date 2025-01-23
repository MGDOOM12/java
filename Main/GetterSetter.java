package Main;

public class GetterSetter {
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or modifying them.abstract 
        // GETTERS = Method that make a field READABLE. 
        // SETTERS = Methods that make a field WRITEABLE.

        Car car = new Car("Toyota", "Tacoma", 2017, "Beige", 25000);

        car.setColor("Red");
        car.setPrice(12000);

        System.out.println(car.getModel());

        System.out.println(car);
    }
}
