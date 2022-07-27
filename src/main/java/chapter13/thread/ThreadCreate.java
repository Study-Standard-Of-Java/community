package chapter13.thread;


public class ThreadCreate {
    public static void main(String[] args) {
        ThreadAbstract t1 = new ThreadAbstract();

        Runnable r = new ThreadInterface();
        Thread t2 = new Thread(r);

        t1.start();
        t2.start();
    }
}

class ThreadAbstract extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadInterface implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}