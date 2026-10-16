// Convert Octal to Binary
// We can convert octal to binary directly because each octal digit
// corresponds to 3 binary bits, as 8 = 2^3.
// However, we can also convert using the intermediate decimal value.
//
// The conversion flow used in this program is:
// Octal -> Decimal -> Binary
//
// Integer.parseInt(s, 8) interprets the String as an octal number
// and converts it to an int value.
// Example: "17" (octal) -> 15 (decimal)
//
// Integer.parseInt(s, 2) interprets the String as a binary number
// and converts it to an int value.
// Example: "1010" (binary) -> 10 (decimal)
//
package Placement_Training;
import java.util.*;

public class Day1_Question4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int dec = Integer.parseInt(s, 8); // 8 represents the radix (base), which is octal
        String bin = Integer.toBinaryString(dec);
        System.out.println(bin);
    }

}

// What is implicit and explicit casting?
//
// Implicit casting (widening) happens automatically when converting
// from a compatible smaller-range type to a larger-range type.
// Example:
// int a = 10;
// long b = a; // Implicit casting (no data loss)
//
// Explicit casting (narrowing) requires the programmer to specify
// the target type. It may cause data loss.
// Example:
// long a = 10;
// int b = (int) a; // Explicit casting (no data loss in this example)
//
// We cannot directly cast a String to a primitive int.
// Instead, we can use Integer.parseInt() to convert numeric text
// into an int value.

// What is a wrapper class?
//
// A wrapper class represents a primitive value as an object.
// Integer is the wrapper class for int.
//
// What is the output of:
// Integer x = 10;
// int y = x;
//
// Here, Integer is a wrapper class.
// Integer x = 10; // Autoboxing: int value to Integer object
// int y = x;      // Unboxing: Integer object to int value
//
// Autoboxing -> Converting a primitive value into its wrapper object.
// Unboxing -> Converting a wrapper object into its primitive value.
//
// Java performs autoboxing and unboxing automatically.
// These are conversions between primitive types and wrapper classes,
// not ordinary primitive type casting.
