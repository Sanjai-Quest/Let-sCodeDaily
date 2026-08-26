package Strings;

public class DirectIndexing {

    public static char firstCharcter(String s) {
        return s.charAt(0);
    }

    public static char lastCharacter(String s) {
        return s.charAt(s.length() - 1);
    }

    public static void bothCharcters(String s) {
        System.out.println(s.charAt(0) + " " + s.charAt(s.length() - 1));
    }

    public static char printIndexValue(String s, int index) {
        return s.charAt(index);
    }

    public static char middleIndexValue(String s) {
        return s.charAt(s.length() / 2);
    }

    public static void main(String[] args) {
        String s = new String("Sanjai");
        System.out.println(firstCharcter(s));
        System.out.println(lastCharacter(s));
        bothCharcters(s);
        System.out.println(printIndexValue(s, 2));
        System.out.println(middleIndexValue(s));
    }

}
