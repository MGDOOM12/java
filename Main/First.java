package Main;
public class First {

    // Main method that is required for all programs to run 
    public static void main(String[] args){
        // System.out.print is logging data to the console
        System.out.println("\"Hello, World\"");
        System.out.println(("My name is Kale"));

        // Variables - Placeholder for a value that behaves as the value it contains
        /* Data types
         * boolean - 1 bit - primitive - true or false
         * byte - 1 byte - primitive - -128 to 127
         * short - 2 bytes - primitive -32,768 to 32,767
         * int - 4 bytes - primitive - -2 billion to 2 billion
         * long - 8 bytes - primitive - -9 quintillion to 9 quintillion
         * float - 4 bytes - primitive - fraction numbers up to 6-7 digits
         * double - 8 byte - primitive - fraction nubmer up to 15 digits 
         * chan - 2 bytes - primitive  - single character/letter/ASCII value
         * string - varies - reference - a sequence of characters
         * 
         * Primitive 
         * 8 Types
         * Store Data 
         * can only hold 1 value 
         * less memory 
         * fast
         * 
         * Reference
         * unlimted (user defined)
         * stores an address
         * could hold more than 1 value
         * more memory 
         * slower
         */
        int x = 123;
        byte little = 127;
        float y = 3.14f;
        double z = 3.14;
        boolean a = true;
        char symbol = '@';
        String name = "Kale";

        System.out.println(x);
        System.out.println("My number is: " +little);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(symbol);
        System.out.println(name);
    }

}


