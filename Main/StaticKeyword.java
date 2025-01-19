package Main;

public class StaticKeyword {
    public static void main(String[] args) {
        // static = Makes a variable or method belong to the class rather than to any specific object. Commonly used for utility methods or shared res

        Friend friend1 = new Friend("Luffy");
        Friend friend2 = new Friend("Zoro");

        System.err.println(friend1.numOfFriends);
        System.err.println(friend2.numOfFriends);

        Friend.showFriends();
    }
}
