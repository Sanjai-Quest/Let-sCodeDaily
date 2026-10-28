package Placement_Training;

import java.util.*;

public class CountEvenandOdd {
    static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n < 1) {
            System.out.println("Invalid Input");
            return;
        }
        int counteven = 0;
        int countodd = 0;
        while(n > 0) {
            int digit = n % 10;
            if(isEven(digit)) {
                counteven++;
            } else countodd++;
            n /= 10;
        }
        System.out.println(counteven);
        System.out.println(countodd);
    }
}