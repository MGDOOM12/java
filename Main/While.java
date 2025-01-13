package Main;
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        // while loop = repeat some code forever while some condition remains true
        Scanner scanner = new Scanner(System.in);

        // String name = "";

        // while(name.isEmpty()){
        //     System.out.print("Enter your name: ");
        //     name = scanner.nextLine();
        // }
        // System.out.printf("Hello %s \n", name);

        int age;
        
        // System.out.print("Enter your age: ");
        // age = scanner.nextInt();

        // while( age != 21){
        //     System.out.printf("Sorry you are %d year old and to young to come into the Bar \n", age);
        //     age++;
        // }

        do { 
            System.out.println("Your age cannot be negative");
            System.out.print("Enter your age: ");
            age = scanner.nextInt();
        } while (age < 0);
        
        System.out.printf("You are %d years old \n", age);

        scanner.close();
    }

}
