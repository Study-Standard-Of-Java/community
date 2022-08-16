package chapter13.daemon;

public class GenerateDaemon implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread t = new Thread(new GenerateDaemon());
        t.setDaemon(true);
        t.start();

        for (int i = 1; i <= 10; i++) {
            try {
                
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            System.out.println(i);
            if (i == 5) {
                autoSave = true;
            }
        }
        System.out.println("프로그램을 종료합니다");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (autoSave) {
                Thread generatedByDaemonThread = new Thread(new GenerateDaemon());
                System.out.println("generatedByDaemonThread.isDaemon() = " + generatedByDaemonThread.isDaemon());
                autoSave();
            }
        }
    }

    public void autoSave() {
        System.out.println("작업 파일이 저장되었습니다.");
    }
}
