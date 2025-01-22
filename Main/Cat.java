package Main;

public class Cat extends Animal{

    void meow(){
        System.out.println("meow");
    }

    @Override
    void speak(){
        System.out.println("The cat cant speak now.");
    }
}
