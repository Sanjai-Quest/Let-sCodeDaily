package Strings;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if ((right - left + 1) > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if ((right - left + 1) > maxLength) {
                    start = left;
                    maxLength = right - left + 1;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring solution = new LongestPalindromicSubstring();

        String[] testCases = {
                "babad",
                "cbbd",
                "a",
                "ac",
                "banana",
                "racecar"
        };

        for (String test : testCases) {
            System.out.println(test + " -> " + solution.longestPalindrome(test));
        }
    }
}
