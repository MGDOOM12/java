package Main;
public class Constructors {

    public static void main(String[] args) {
        // Constructor = A special method to initialize objects. You can pass arguements to a contructor and set up inital values.

        Student student1 = new Student("Jake", 31, 2.5, false);
        System.out.println(student1.name);
        student1.study();
    }
}
