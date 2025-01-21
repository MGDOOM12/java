package Main;

public class PolyMorphism {
    public static void main(String[] args) {
        // Polymorphism = "Poly" = "Many" "Morph"= "Shape" Objects can identify as other objects. Objects can be treated as objects of a common superclass. 

        Car car = new Car("Toyota", "Rav4", 1999, "Silver");
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] vehicles ={car,bike,boat};
        

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
