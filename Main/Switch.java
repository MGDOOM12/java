package Main;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        // Enhanced switch = replacement to many else if statements
        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("What day is it? ");
        day = scanner.nextLine().toLowerCase();

        switch(day){
            case "monday" -> System.out.println("It is the worst day of the week");
            case "tuesday" -> System.out.println("It is a weekday");
            case "wednesday" -> System.out.println("It is a weekday");
            case "thursday" -> System.out.println("It is a Friyayeve!");
            case "friday" -> System.out.println("It is Friyay! Pretty much the weekend");
            case "saturday" -> System.out.println("It is the weekend!");
            case "sunday" -> System.out.println("The weekend is almost over!");

        }
        scanner.close();
    }
}
