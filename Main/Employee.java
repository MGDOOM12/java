package Main;

import java.text.DecimalFormat;
import java.util.Locale;

public class Employee extends Person {

    double salary;

    Employee(String first, String last, double salary){
        super(first, last);
        this.salary = salary;
    }


    void showSalary(){
        System.out.println(this.first + " makes " + this.salary + " per year");
    }

}
