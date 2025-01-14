package Main;

public class ForLoop {
    public static void main(String[] args) {
        // for loop = execute some code a certain amount of times

        for ( int i = 10 ; i >= 0  ; i--) {
            if(i == 10){
                System.out.println("T minus " + i);
            }
            else{
                System.out.println(i);
            }
        }
    }
}
