package chapter8.ExceptionEx;

public class MethodException {

    public static void allException() throws ArithmeticException {
        System.out.println(0 / 0);

    }

    public static void main(String[] args) {
        System.out.println("start");

        try {
            allException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
