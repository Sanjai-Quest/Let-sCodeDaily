package Placement_Training;

public class TrickyShortQuestions {

    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        int c = a-- + --b + a++ - ++b + --a;
        System.out.println(c);

        int x = 2;
        int ans = (x > 3) ? (x < 5) ? 10: 20 : 30;
        System.out.println(ans);
    }

}
