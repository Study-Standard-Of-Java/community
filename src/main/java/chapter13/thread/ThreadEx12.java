package chapter13.thread;

import java.util.Map;

public class ThreadEx12 {
    public static void main(String[] args) {
        ThreadEx12_1 th1 = new ThreadEx12_1();
        ThreadEx12_2 th2 = new ThreadEx12_2("2");
        ThreadEx12_2 th3 = new ThreadEx12_2("3");
        ThreadEx12_2 th4 = new ThreadEx12_2("4");
        ThreadEx12_2 th5 = new ThreadEx12_2("5");
        ThreadEx12_2 th6 = new ThreadEx12_2("6");
        ThreadEx12_2 th7 = new ThreadEx12_2("7");
        ThreadEx12_2 th8 = new ThreadEx12_2("8");
        ThreadEx12_2 th9 = new ThreadEx12_2("9");
        ThreadEx12_2 th10 = new ThreadEx12_2("10");
        ThreadEx12_2 th11 = new ThreadEx12_2("11");
        ThreadEx12_2 th12 = new ThreadEx12_2("12");


//        ThreadEx12_3 th3 = new ThreadEx12_3();
//        ThreadEx12_4 th4 = new ThreadEx12_4();
//        ThreadEx12_5 th5 = new ThreadEx12_5();
//        ThreadEx12_6 th6 = new ThreadEx12_6();
//        ThreadEx12_7 th7 = new ThreadEx12_7();
//        ThreadEx12_8 th8 = new ThreadEx12_8();
//        ThreadEx12_9 th9 = new ThreadEx12_9();
//        ThreadEx12_10 th10 = new ThreadEx12_10();
//        ThreadEx12_11 th11 = new ThreadEx12_11();
//        ThreadEx12_12 th12 = new ThreadEx12_12();


        th1.start();
        th2.start();
        th3.start();
        th4.start();

        th5.start();
        th6.start();
        th7.start();
        th8.start();
        th9.start();
        th10.start();
        th11.start();
        th12.start();


        System.out.print("<<main 종료>");
    } // main
}

class ThreadEx12_1 extends Thread {

    public void run() {

        for(int i=0; i < 30000; i++) {
            System.out.print("-");
        }

        System.out.println();
        System.out.print("<<th1 종료>>");
    } // run()
}

class ThreadEx12_2 extends Thread {
    public ThreadEx12_2(String name) {
        super(name);
    }

    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0; i < 300; i++) {
            System.out.print(currentThread().getName()+" ");
        }
        System.out.println();
        System.out.print("thread- "+ currentThread().getName()+"종료");
    } // run()
}

class ThreadEx12_3 extends Thread {
    public void run() {
        for(int i=0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th3 종료>>");
    } // run()
}
class ThreadEx12_4 extends Thread {
    public void run() {
        for(int i=0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th4 종료>>");
    } // run()
}class ThreadEx12_5 extends Thread {
    public void run() {
        for(int i=0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th5 종료>>");
    } // run()
}class ThreadEx12_6 extends Thread {
    public void run() {
        for(int i=0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th6 종료>>");
    } // run()
}
class ThreadEx12_7 extends Thread {
    public void run() {
        for(int i=0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th7 종료>>");
    } // run()
}
class ThreadEx12_8 extends Thread {
    public void run() {
        for(int i=0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th8 종료>>");
    } // run()
}
class ThreadEx12_9 extends Thread {
    public void run() {
        for(int i=0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th9 종료>>");
    } // run()
}
class ThreadEx12_10 extends Thread {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th10 종료>>");
    } // run()
}
class ThreadEx12_11 extends Thread {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th11 종료>>");
    } // run()
}
class ThreadEx12_12 extends Thread {
    public void run() {
        for (int i = 0; i < 30000; i++) {
            System.out.print("|");
        }
        System.out.println();
        System.out.print("<<th12 종료>>");
    } // run()
}
