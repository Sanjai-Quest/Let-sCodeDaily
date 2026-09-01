package Strings;

import java.util.Arrays;

public class LargestNumber {
    public static String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return "";
        }

        String[] values = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            values[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(values, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder result = new StringBuilder();
        for (String value : values) {
            result.append(value);
        }

        return result.charAt(0) == '0' ? "0" : result.toString();
    }

    public static void main(String[] args) {
        int[][] testCases = {
                {10, 2},
                {3, 30, 34, 5, 9},
                {0, 0},
                {1},
                {12, 121},
                {121, 12},
                {2, 21}
        };

        for (int[] testCase : testCases) {
            System.out.println(Arrays.toString(testCase) + " -> " + largestNumber(testCase));
        }
    }
}
