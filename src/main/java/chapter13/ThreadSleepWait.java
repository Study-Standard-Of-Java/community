package chapter13;

import java.util.ArrayList;
import java.util.List;

public class ThreadSleepWait {
    public static void main(String[] args) {
        Test test = new Test();
        Test test2 = new Test();
        List<Sleep> list = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            list.add(new Sleep(test, i));
        }

        for (int i = 0; i < 200; i++) {
            list.get(i).start();
//            new Sleep(test, -2).start();
            new Sleep(test2, -1).start();
        }
    }
}

class Test {
    public synchronized void test(int i) {
        try {
            System.out.println("start = " + i);
//            wait(100);
            Thread.sleep(2000);
            System.out.println("end = " + i);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Sleep extends Thread {
    Test t;
    int value;

    Sleep(Test test, int value) {
        this.t = test;
        this.value = value;
    }
    @Override
    public void run() {
        t.test(value);
    }
}