package Main;

public class SuperDuper {
    public static void main(String[] args) {
        // super = Refers to the parent class (sublcalls <- superclass). Used in construcotrs and method overriding calls the parent constructor to initialize attributes

        Person person = new Person("Luke", "Skywalker");
        Pupil pupil = new Pupil("Ben", "Solo", 2.0);
        Employee employee = new Employee("Jean", "Grey", 1000000.00);

        person.showName();
        pupil.showName();
        employee.showSalary();
        
    }
}
