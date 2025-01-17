package Main;

public class Varargs {
    public static void main(String[] args) {
        // Variable arguments or varargs = allow a method to accept a varying # of arguments makes methods moer flexibel, no need for overloaded methods java will pack the arguments into an array
        int total = add(1,2,3,4,5,6,7,8,9);

        System.out.println(total);
    }

    static int add(int... numbers){
        int sum = 0;

        for(int number : numbers){
            sum += number;
        }

        return sum;
    }
}
