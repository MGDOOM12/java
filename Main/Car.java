package Main;

public class Car extends Vehicle{

    private final String make ;
    private String model;
    private int year;
    private double price;
    private boolean isRunning;
    private String color;
    Engine engine;

    Car(String make, String model, int year, String color, int price, String engineType){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engine = new Engine(engineType);

    }

    @Override
    void go(){
        System.out.println("You are driving the car");
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model + " " + this.price;
    }

    void start(){
        isRunning = true;
        System.out.println("You started the engine");
        
    }

    void stop(){
        isRunning = false;
        System.out.println("You stopped the engine");
    }

    String getModel(){
        return this.model;
    }

    String getMake(){
        return this.make;
    }

    int getYear(){
        return this.year;
    }

    String getColor(){
        return this.color;
    }

    void setColor(String color){
        this.color = color;
    }

    void setPrice(int price){
        this.price = price;
    }

}
