package chapter13.thread;

public class ThreadException {
    public static void main(String[] args) {
        ExceptionGenerate t1 = new ExceptionGenerate();
        t1.start();
    }
}

class ExceptionGenerate extends Thread {
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
