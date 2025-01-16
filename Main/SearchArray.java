package Main;

public class SearchArray {
 
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6 , 7 , 8, 3};

        int target = 3;

        for(int i = 0; i < numbers.length; i++){
            if( target == numbers[i]){
                System.out.println( "We found " + numbers[i] + " at index "+ i);
                break;
            }else if(i  == numbers.length - 1){
                System.out.println("Sorry you number cannot be found");
            }
            else{
                System.out.println("Still looking...");
            }

        }
        

    }
}
