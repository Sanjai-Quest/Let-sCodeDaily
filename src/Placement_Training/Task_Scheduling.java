package Placement_Training;

import java.util.Arrays;

public class Task_Scheduling {

    public static void main(String[] args) {
        int arr[][] = {
                {2, 5},
                {1, 3},
                {4, 6},
                {7, 8},
                {9, 10},
                {10, 11},
                {1, 2}
        };
        Arrays.sort(arr, (a, b) -> a[1] - b[1]);
        int count = 1, lend = arr[0][1];
        for(int i = 1; i < arr.length; i++) {
            int st = arr[i][0];
            int end = arr[i][1];
            if(st >= lend) {
                count++;
                lend = end;
            }
        }
        System.out.println("Count: " + count);
    }

}
