package Main;

public class Intfaces {
    public static void main(String[] args) {
        // Interfaces = a blueprint for a class that specifies a set of abstract methods that implementing classes must define. Supports multiple inheritance-like behavior.

        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
