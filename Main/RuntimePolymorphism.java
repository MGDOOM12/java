package Main;
import java.util.Scanner;

public class RuntimePolymorphism {

    public static void main(String[] args) {
        // Runtime polymorphism = When the method that gets executed id decided at runtime based on the actual type of the object.

        Scanner scanner = new Scanner(System.in);

        Animal animal = null;

        System.err.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();


            if(choice == 1 ){
                animal = new Dog();
                animal.speak();
           }
           else if(choice == 2){
               animal = new Cat();
               animal.speak();
           }  
    }
}
