package Main;

public class Pet {

    String type;
    String name;

    Pet(String type, String name){
        this.type = type;
        this.name = name;
    }

    void giveTreat(){
        System.out.println( this.name + " is happy");
    }
}
