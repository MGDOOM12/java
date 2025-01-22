package Main;

public class Substrings {
    public static void main(String[] args) {
        // .substring() is a method used to extract a portion of a string
        char firstCharDomain = '@';
        String email = "MGDOOM.DOOM@gmail.com";
        String email2 = "C.C@outlook.com";
        String username = email2.substring(0,email2.indexOf(firstCharDomain));
        String domain = email.substring(email.indexOf(firstCharDomain), email.length());
        

        System.out.println(username);
        System.out.println(domain);

    }
}
