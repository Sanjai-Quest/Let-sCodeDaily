package Strings;

public class lenLastWord {

    public static int lengthOfLastWord(String s) {
        String[] word = s.trim().split("\\s+");
        String res = word[word.length - 1];
        int n = res.length();
        return n;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

}