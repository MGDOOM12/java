package Main;
import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        // ternary operator ? = Returns true or false 
        // variable = condition ? ifTrue : ifFalse


        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        String isEven = number % 2 == 0 ? "This is an even number" : "This is an odd number";

        System.out.println(isEven);


        scanner.close();
    }
}
