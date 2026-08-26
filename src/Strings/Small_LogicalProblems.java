package Strings;

public class Small_LogicalProblems {

    public static void printFirstHalf(String s) {
        for(int i = 0; i < s.length() / 2; i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void printSecondHalf(String s) {
        for(int i = s.length() / 2; i < s.length(); i++) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void reverseString(String s) {
        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static int withoutLengthFun(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) {
            count++;
        }
        return count;
    }

    public static void printEverySecondIndex(String s) {
        for(int i = 0; i < s.length() - 1; i += 2) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void main(String[] args) {
        String s = "Sanjai";
        printFirstHalf(s);
        System.out.println();
        System.out.println(withoutLengthFun(s));
        printSecondHalf(s);
        System.out.println();
        reverseString(s);
        System.out.println();
        printEverySecondIndex(s);
    }

}
