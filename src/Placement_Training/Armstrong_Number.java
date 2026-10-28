package Placement_Training;
import java.util.*;
public class Armstrong_Number {
    static boolean isArms(int n) {
        if(n >= 1 && n <= 9) return true;
        int temp = n;
        int len = 0;
        while(n > 0) {
            n /= 10;
            len++;
        }
        n = temp;
        int arm = 0;
        while(n > 0) {
            int digit = n % 10;
            arm = arm + (int)Math.pow(digit, len);
            n /= 10;
        }

        return temp == arm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean flag = false;
        if(isArms(a)) {
            flag = true;
            System.out.println("Armstrong Number");
        } else System.out.println("Not a Armstrong Number");
    }

}
