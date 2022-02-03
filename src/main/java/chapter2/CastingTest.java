package chapter2;

public class CastingTest {

    public static void main(String[] args) {
        double d = 85.4;
        int score = (int) d;


        System.out.println("score = " + score);
        System.out.println("d = " + d);

        byte b = (byte) 1000;
        System.out.println("b = " + b);

        int i = 3;
        double dd = 1.0 + i;
        System.out.println("dd = " + dd);
    }
}
