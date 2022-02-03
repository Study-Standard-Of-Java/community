package chapter2;

public class OverFlowTest {
    public static void main(String[] args) {
        short sMin = -32768;

        System.out.println("sMin = " + sMin);
        System.out.println("(short)(sMin-1) = " + (short) (sMin - 1));

        short sMax = 32767;
        System.out.println("sMax = " + sMax);
        System.out.println("(short) (sMax+1) = " + (short) (sMax + 1));

    }
}
