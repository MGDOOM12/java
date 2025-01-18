package Main;

public class ArrayOfObjects {
    
    public static void main(String[] args) {
        
        Pet myPet = new Pet( "Dog",  "Benson");
        Pet gfPet = new Pet("Dog", "Bambi");
        Pet roommatePet = new Pet("Cat", "Pablo");
        // myPet.giveTreat();

        // Pet[] pets = {myPet,gfPet,roommatePet};

        Pet[] pets = {
            new Pet("Dog",  "Benson"),
            new Pet("Dog", "Bambi"),
            new Pet("Cat", "Pablo")
        };

        // for(int i = 0; i < pets.length; i++) {
        //     System.out.println(pets[i].name);
        // }

        for(Pet pet: pets){
            pet.giveTreat();
        }

    }
}
