package Main;
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        
        Random random = new Random();

        int nubmer;
        // Will print nubmer between -2 billion and 2 billion
        // nubmer = random.nextInt();
        // The bound (2nd number bust be one higher than the last nubmer needed in the random generator. Below === 1 - 100. If I put 1, 100 it would be 1-99 )
        nubmer = random.nextInt( 1, 101);

        boolean isHeads;

        isHeads = random.nextBoolean();


        System.out.println(nubmer);
        System.out.println(isHeads);
    }
}
