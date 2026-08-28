package Strings;

import java.util.Arrays;

public class validAnagaram {

    public static boolean isvalid(String s, String t) {
        if(s.length() == t.length()) return true;

        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);

        return Arrays.equals(cs, ts);
    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isvalid(s, t));
    }

}
