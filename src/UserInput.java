package src;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        // This following scanner is used to prevetn a new line issue (input buffer) that will casuse issues if a String were to follow a double or int
        scanner.nextLine();

        System.out.print("What is your GPA: ");
        double gpa = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Are you a Studnent? (true/false)");
        boolean student = scanner.nextBoolean();

        System.out.println("Hello " +name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        if(student){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You need to enroll first");
        };
        scanner.close();
    }
}
