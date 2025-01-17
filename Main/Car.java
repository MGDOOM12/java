package Main;

public class Car {

    String make = "Toyota";
    String model = "Camry";
    int year = 2025;
    double price = 30000.00;
    boolean isRunning = false;

    void start(){
        isRunning = true;
        System.out.println("You started the engine");
        
    }

    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine");
    }
}
