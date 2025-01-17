package Main;

public class TwoDArray {

    public static void main(String[] args) {
        // 2D array = An array where each element is an array. Usefull for storing a matirx of data.abstract 

        // String[] fruits = {"apple", "oraange", "banana"};
        // String[] vegetables = {"potato", "onion", "carrot"};
        // String[] meats = {"chicken", "pork","fish","beef"}; 

        // String[][] groceries = {fruits,vegetables,meats};
        String[][] groceries = {{"apple", "oraange", "banana"}
                                ,{"potato", "onion", "carrot"},
                                {"chicken", "pork","fish","beef"}};
        int index = 0;
        // for(String[] items:groceries){
        //     for(String food:items){
        //         index++;
        //         System.out.println( "Item " + index + ": " + food);
        //     }
        // }

        groceries[0][0] = "pineapple";
        System.out.println(groceries[0][0]);

    }
}
