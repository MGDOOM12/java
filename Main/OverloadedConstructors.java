package Main;

public class OverloadedConstructors {
    public static void main(String[] args) {
        // Overloaded constructors = Allow a class to have multiple constructors with differetn parameter lists. Enable objects to be initialized in vairous ways.

        User user1 = new User("MeanGreens", "mg@hotmail.com");

        System.out.println(user1.username);
        System.out.println(user1.email);
    }
}
