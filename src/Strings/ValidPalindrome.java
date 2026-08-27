package Strings;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int last = s.length() - 1;

        while (start <= last) {

            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            }
            else if (!Character.isLetterOrDigit(currLast)) {
                last--;
            }
            else {

                if (Character.toLowerCase(currFirst) !=
                        Character.toLowerCase(currLast)) {

                    return false;
                }

                start++;
                last--;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = "madam";
        String s4 = "hello";

        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
    }
}
