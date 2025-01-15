package Main;

import java.util.Scanner;

public class UserInputArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] foods = new String[3];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Please enter in a food: ");
            foods[i]= scanner.nextLine();
        }

        for(String addedfood: foods){
            System.out.println(addedfood);
        }

    }
}
