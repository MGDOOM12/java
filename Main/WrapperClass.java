package Main;

public class WrapperClass {
    public static void main(String[] args) {
        
        // Wrapper classes = Allow primitive values (int, char, double, boolean) to be used as objects. "Wrap them in an object" Generally, don't wrap primitive unless you need an object. Allows use of Collections Framework and static Utility Methods.

        // Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;

        // Unboxing
        int x = a;
        double y = b;
        char z = c;

        int parseIntTest  = Integer.parseInt("12345");
        double parseDoubleTest = Double.parseDouble("4.0");
        char parseCharTest = "String".charAt(0);
        boolean parseBooleanTest = Boolean.parseBoolean("true");

        String j = a.toString(); 

        System.out.println(j);
    }
}
