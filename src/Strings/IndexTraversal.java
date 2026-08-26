package Strings;

public class IndexTraversal {

    public static void printLefttoRight(String s) {
        for(int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
    }

    public static void printRighttoLeft(String s) {
        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }
    }
    public static void evenIndices(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 == 0) {
                System.out.println(s.charAt(i));
            }
        }
    }

    public static void oddIndices(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(i % 2 != 0) {
                System.out.println(s.charAt(i));
            }
        }
    }

    public static void printWithIndices(String s) {
        for(int i = 0; i < s.length(); i++) {
            System.out.println(i + " -> " + s.charAt(i));
        }
    }

    public static void main(String[] args) {
        String s = "Sanjai";
        printLefttoRight(s);
        System.out.println();
        printRighttoLeft(s);
        System.out.println();
        evenIndices(s);
        System.out.println();
        oddIndices(s);
        System.out.println();
        printWithIndices(s);
    }

}
