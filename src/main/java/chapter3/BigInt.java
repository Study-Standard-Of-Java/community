package chapter3;

public class BigInt {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 2000000;

        long c = a * b;
        System.out.println("c = " + c);

        c = (long) a * b;
        System.out.println("c = " + c);


    }
}
