package Chpater6;

public class Overloading {

    public long add(int a, long b) {
        return a+b;
    }
    public long add(long a, int b) {
        return a+b;
    }
    public static void main(String[] args) {
        Overloading overloading = new Overloading();
        long add = overloading.add(3, 5L);
        long add1 = overloading.add(5L, 3);
        System.out.println("add = " + add);
        System.out.println("add1 = " + add1);

    }
}
