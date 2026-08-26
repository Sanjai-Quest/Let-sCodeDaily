package Strings;

import java.util.Arrays;

public class StringBasics2 {

    public static void main(String[] args) {

        //Demonstration of how println prints int, String, Arrays
        int a = 10;
        System.out.println(a); //prints in the flow of int -> println -> valueOf -> Integer.toString()

        String s = "Sanjai";
        System.out.println(s); // prints in the flow of String -> println -> valueOf -> obj.toString()

        System.out.println(new int[]{1, 2, 3, 4}); // uses the same flow as int and String but at last uses hascode with '@' to print
        //To print an proper Array we shall use the arrays method of toString()
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4}));


        //Indexing
        //Usually in arrays we use a[0] to access 0th index values.
        //But if we tried to access the 0th index value with the same method in String we may get error.
        //Cause String is a class and it is a collection of characters.
        //So we must use .charAt() method to access values of string.

        String name = "Mitsuha";
        System.out.println(name.charAt(0));//gives 'M'

    }

}
