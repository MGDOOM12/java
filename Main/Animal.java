package Main;

public abstract class Animal extends Organism {

    void eat(){
        System.out.println("This animal is eating.");
    }

    void move(){
        System.out.println("This animal is moving!");
    }

    abstract void speak();
}
