package Placement_Training;

import java.util.*;
public class Day1_Question5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        String ans = (a < 0 || b < 0|| c < 0 || a + b < c || b + c < a || a + c < b) ?
                "Invalid input" : (a == b && b == c) ?
                "Equilateral" : (a == b || b == c || a == c) ?
                "Isoceles" : "Scalene";

        System.out.println(ans);
    }

}
