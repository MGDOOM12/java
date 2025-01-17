package Main;

public class OOP {
    public static void main(String[] args) {
        // Object = An entity that holds data (attributes) and can perfomr actions(methods). It is a reference data type.

        Car mycar = new Car();
        
        // System.out.println(mycar.model);
        // System.out.println(mycar.make);
        // System.out.println(mycar.year);

        System.out.println(mycar.isRunning);
        mycar.start();
        System.out.println(mycar.isRunning);
        mycar.stop();
        System.out.println(mycar.isRunning);
    }
}
