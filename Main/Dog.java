package Main;

public class Dog extends Animal{

    void bark(){
        System.out.println("Roof Roof");
    }

    @Override
    void speak(){
        System.out.println("The dog can speak now.");
    }
}
