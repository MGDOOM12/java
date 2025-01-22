package Main;

public class StringMethods {
    public static void main(String[] args) {
        
        String name = "MGDOOM DOOM";
        String secondName = "    Thee Unknown    ";
        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("e");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.replace('K', 'T');
        // secondName = secondName.trim();


        // System.out.println(length);
        // System.out.println(letter);
        // System.out.println(index);
        // System.out.println(lastIndex);
        System.out.println(name);
        System.out.println(secondName);
        System.out.println(name.isEmpty());
        System.out.println(name.equals("MGDOOM DOOM"));
        
         

    }
}
