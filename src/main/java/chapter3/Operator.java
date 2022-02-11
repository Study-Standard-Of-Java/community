package chapter3;

public class Operator {
    public static void main(String[] args) {
        int i=5;
        i++;
        System.out.println("i = " + i);

        ++i;
        System.out.println("i = " + i);

        int j= i++;
        System.out.println("j = " + j);
        System.out.println("i = " + i);
    }
}
