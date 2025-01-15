package Main;

public class OverloadedMethods {
    public static void main(String[] args) {
        // overloaded methods = methods that share the same name, but different parameters, signature = name + parameters

        double number = add(1,11);
        double number2 = add(1,4, 7);
        System.out.println(number);
        System.out.println(number2);

    }

    static double add(double a, double b){
        return a + b;
    }

    static double add(double a, double b, double c){
        return a + b + c;
    }

}
