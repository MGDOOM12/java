package Main;

import java.util.Scanner;

public class ifStatements {
    public static void main(String[] args) {
        
        boolean isStudent;
        boolean isSenior;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Are you a Student: (true/false) ");
        isStudent = scanner.nextBoolean();

        System.out.print( "Are you 65 or older: (true/false) ");
        isSenior = scanner.nextBoolean();

        if( isStudent){
            if(isSenior){
                System.out.println("You getting the senior discound which is free!");
            }
            else{
                System.out.println("You will just get the student discount which is half off!");
            }
        }
        else{
            System.out.println("Sorry you are not a studnent so you have to pay full price");
        }


        scanner.close();
    }
}
