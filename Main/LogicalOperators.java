package Main;
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
        // && = AND
        // || = OR
        // ! = NOT
        
        Scanner scanner = new Scanner(System.in);
        int temp = 10;

        System.out.print("Choose a random number: ");
        temp = scanner.nextInt();

        if(temp >= -50 && temp <= 32){
            System.out.println("It is Freezing out!");
        }
        else if(temp >= 33 && temp <= 65 ){
            System.out.println("It is still a little chilly out.");
        }
        else if(temp <= -51 || temp >= 130){
            System.out.println("You are either in the center of Antartica or Sahara desert or no longer on earth");
    
        }
        else{
            System.out.println("This is pretty nice weather out!");
        }

        scanner.close();
    }
}
