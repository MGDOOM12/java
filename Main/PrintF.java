package Main;

public class PrintF {
    public static void main(String[] args) {
        // PrintF is a method used to format an output
        // %[flags][width][.precision][sprecifier-character]
        String name = "MGDOOM";
        char firstletter = 'K';
        int age = 27;
        double height = 76.0;
        boolean isEmployed = true;

        // System.out.printf("Hello %s \n",name);
        // System.out.printf("The first letter of your name is %c \n", firstletter);
        // System.out.printf("You are %d years old \n", age);
        // System.out.printf("You are %f inches tall \n", height);
        // System.out.printf("Employed: %b \n", age);
        // System.out.printf("%s, is %d years old \n", name, age);
        

        double price1 = 4.99;
        double price2 = 5000.99;
        double price3 = -6.99;

        // [persicion]
        // System.out.printf("%.1f \n", price1);
        // System.out.printf("%.2f \n", price2);
        // System.out.printf("%.3f \n", price3);

        // [flags]
        // + = output a plus
        //  , = comma grouping separator
        // ( = negative nubmers are enclopsed in ()
        // space = display a minus if negative, space if postive

        // System.out.printf("%+.1f \n", price1);
        // System.out.printf("%,.2f \n", price2);
        // System.out.printf("%(.3f \n", price3);
        // System.out.printf("% .3f \n", price3);
        // System.out.printf("% ,.3f \n", price2);

        //[width]
        // 0 = zero padding
        // number = right justified padding
        // negative number = left justifeid padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d \n", id1);
        System.out.printf("%4d \n", id2);
        System.out.printf("%-4d \n", id3);
        System.out.printf("%4d \n", id4);

    }
}
