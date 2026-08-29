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
        String s1 = "Hello    Sanjai how are       u";
        System.out.println(lengthOfLastWord(s));
        System.out.println(lengthOfLastWord(s1));
    }

}