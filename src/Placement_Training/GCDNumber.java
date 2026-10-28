package Placement_Training;

import java.util.*;
public class GCDNumber {
    static int isGcd(int a, int b) {
        if(b == 0) return a;
        return isGcd(b, a % b);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a < 1 || b < 1) {
            System.out.println("Invalid Input");
            return;
        }
        System.out.println(isGcd(a, b));
    }
}