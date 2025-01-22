package Main;

public class Methods {
    public static void main(String[] args) {
        // methods = a block of reusable code that is executed when called ()
        String name = "MGDOOM";
        int age = 27;

        // happyBirthday(name, age);
        double squared = square(7);
        double cubed = cube(squared);

        System.out.println(squared);
        System.out.println(cubed);
            
    }
         
    // static void happyBirthday(String name, int age){
    //     System.out.println("Happy Birthday to you!");
    //     System.out.printf("Happy Birthday dear %s! \n", name);
    //     System.out.printf("You are %d years old! \n", age);
    //     System.out.println("Happy Birthday to you!");
    // }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }
}
