package chapter8.ExceptionEx;

public class MultiCatch {

    public static void main(String[] args) {
        try {
            System.out.println(0 / 0);

        } catch (ArithmeticException | ClassCastException e) {
            e.printStackTrace();
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
}
