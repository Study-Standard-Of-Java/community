package chapter13.single;

public class SingleTest {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 3000; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("소요시간1 :" + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        for (int i = 0; i < 3000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.println("소요시간2 :" + (System.currentTimeMillis() - start));
    }
}
