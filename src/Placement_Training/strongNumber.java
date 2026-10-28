package Placement_Training;

import java.util.Scanner;

public class strongNumber {

    static int fact(int n) {
        if(n == 0 || n == 1) return 1;
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    static boolean isStrong(int n) {
        int sum = 0;
        int temp = n;
        while(n > 0) {
            int digit = n % 10;
            sum = sum + fact(digit);
            n /= 10;
        }
        n = temp;
        return n == sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a < 1) {
            System.out.println("Invalid Input");
            return;
        }
        boolean flag = false;

        if(isStrong(a)) {
            flag = true;
            System.out.println("Strong Number");
        } else System.out.println("Not a Strong Number");
    }
}