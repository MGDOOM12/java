package Main;

public class Car extends Vehicle{

    String make ;
    String model;
    int year;
    double price;
    boolean isRunning;
    String color;

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;

    }

    @Override
    void go(){
        System.out.println("You are driving the car");
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }

    void start(){
        isRunning = true;
        System.out.println("You started the engine");
        
    }

    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine");
    }
}
