package chapter3;

public class OperatorPriority {

    public static void main(String[] args) {
        System.out.println(-3+5);
        int x=5;
        int y=10;
        if (y > 5 || (x > 3 && x < 7)) {
            System.out.println("TRUE");
        }

        int b = (5 < 4) ? 50 : 40;
        System.out.println("b = " + b);
    }
}
