package Main;

public class User {

    String username;
    String email;
    int age;

    User(String username) {
        this.username = username;
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
    }
}
