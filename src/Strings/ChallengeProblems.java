package Strings;

//Given a String, print the characters from the last index to index 2.
//Given a String, print characters at indices divisible by 3.
//Given a String, print the String in reverse without creating another String variable.
//Given a String, print the middle character.
//Given a String, print: First character, Second character, Last character, Second-last character

public class ChallengeProblems {

    public static void printTill2Index(String s) {
        for(int i = s.length() - 1; i >= 2; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static void divisibleBy3(String s) {
        for(int i = 0; i < s.length() - 1; i++) {
            if(i % 3 == 0) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }

    public static void reverseWithout2Variable(String s) {
        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }

    public static char printMiddleChar(String s) {
        return s.charAt(s.length() / 2);
    }

    public static void printAll(String s) {
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.charAt(s.length() - 2));
    }

    public static void main(String[] args) {
        String s = "Sanjai";
        printTill2Index(s);
        System.out.println();
        divisibleBy3(s);
        System.out.println();
        reverseWithout2Variable(s);
        System.out.println(printMiddleChar(s));
        printAll(s);
    }

}
