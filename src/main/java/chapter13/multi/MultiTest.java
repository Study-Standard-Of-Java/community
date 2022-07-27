package chapter13.multi;

public class MultiTest {
    static long startTime = 0;
    public static void main(String[] args) {
        ThreadMulti t1 = new ThreadMulti();
        t1.start();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < 3000; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("소요시간2: " + (System.currentTimeMillis() - MultiTest.startTime));
    }
}

class ThreadMulti extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 3000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.println("소요시간1: " + (System.currentTimeMillis() - MultiTest.startTime));
    }
}