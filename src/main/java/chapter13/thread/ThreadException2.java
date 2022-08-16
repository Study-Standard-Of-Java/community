package chapter13.thread;

public class ThreadException2 {
    public static void main(String[] args) {
        ExceptionGenerate2 t1 = new ExceptionGenerate2();
        t1.run();
    }
}

class ExceptionGenerate2 extends Thread {
    @Override
    public void run() {
        throwException();
    }

    public void throwException() {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}