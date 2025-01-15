package Main;
import java.util.Arrays;

public class ArraysTest {

    public static void main(String[] args) {
        // array = a collection of values of the same data type 

        String [] fruits = {"apple", "orange", "banana", "coconut"};

        fruits[0] = "watermelon";

        // Arrays.sort(fruits);
        Arrays.fill(fruits,"Grapes");

        int [] years = {1996, 1997, 1999, 2000 };

        // System.out.println(fruits[0]);
        // for(int i = 0; i < fruits.length; i++){
        //     System.out.println(fruits[i]);
        // }

        // for(int i = 0; i < years.length; i++){
        //     System.out.println(years[i]);
        // }

        // enhanced for loop

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
