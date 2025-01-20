package Main;

public class Pupil extends Person{

    double gpa;

    Pupil(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    
    void showGPA(){
        System.out.println(this.first + " has a " + this.gpa + " gpa");
    }
}
