package chapter13.synchronizedP.threadwaitrefactor;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

class Customer implements Runnable {
    private Table table;
    private String food;

    Customer(Table table, String food) {
        this.table = table;
        this.food  = food;
    }

    public void run() {
        while(true) {
            try { Thread.sleep(100);} catch(InterruptedException e) {}
            String name = Thread.currentThread().getName();

            table.remove(food);
//            System.out.println(name + " ate a " + food);
        } // while
    }
}

class Cook implements Runnable {
    private Table table;

    Cook(Table table) {	this.table = table; }

    public void run() {
        while(true) {
            int idx = (int)(Math.random()*table.dishNum());
            table.add(table.dishNames[idx]);
            try { Thread.sleep(10);} catch(InterruptedException e) {}
        } // while
    }
}

class Table {
    String[] dishNames = { "donut","donut","burger" }; // donut의 확률을 높인다.
    final int MAX_FOOD = 6;
    private ArrayList<String> dishes = new ArrayList<>();

    private ReentrantLock lock = new ReentrantLock();
    private Condition forCook = lock.newCondition();
    private Condition forCust  = lock.newCondition();
    private Condition forCust2 = lock.newCondition();

    public void add(String dish) {
        lock.lock();

        try {
            while(dishes.size() >= MAX_FOOD) {
                String name = Thread.currentThread().getName();
                System.out.println(name+" is waiting.");
                try {
                    forCook.await(); // wait(); COOK쓰레드를 기다리게 한다.
                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            }

            dishes.add(dish);
            System.out.println("add completed : " + dish);
            System.out.println("Dishes:" + dishes.toString());
            if (dish.equals("donut")) {
                forCust.signal();
            } else if (dish.equals("burger")) {
                forCust2.signal(); // notify();  기다리고 있는 CUST를 깨우기 위함.
            }
        } finally {
            lock.unlock();
        }
    }

    public void remove(String dishName) {
        lock.lock(); //		synchronized(this) {
        String name = Thread.currentThread().getName();

        try {
            while(dishes.size()==0) {
                System.out.println(name+" is waiting.");
                try {
                    forCust.await(); // wait(); CUST쓰레드를 기다리게 한다.
                    forCust2.await();
                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            }

            while(true) {
                for(int i=0; i<dishes.size();i++) {
                    if(dishName.equals(dishes.get(i))) {
                        String food = dishes.get(i);
                        dishes.remove(i);
                        System.out.println("now dishes = " + dishes.toString());
                        forCook.signal(); // notify();잠자고 있는 COOK을 깨움
                        try {
                            if (name.equals("CUST1")) {
                                forCust.await(); // wait(); // CUST쓰레드를 기다리게 한다.
                            } else if (name.equals("CUST2")) {
                                forCust2.await();
                            }
                        } catch (InterruptedException e) {

                        }
                        System.out.println(name + " ate a " + food);
                        return;
                    }
                } // for문의 끝

                try {
                    System.out.println(name+" is waiting.");
                    if (name.equals("CUST1")) {
                        forCust.await(); // wait(); // CUST쓰레드를 기다리게 한다.
                    } else if (name.equals("CUST2")) {
                        forCust2.await();
                    }

                    Thread.sleep(500);
                } catch(InterruptedException e) {}
            } // while(true)
            // } // synchronized
        } finally {
            lock.unlock();
        }
    }

    public int dishNum() { return dishNames.length; }
}

public class ThreadWaitRefactor {
    public static void main(String[] args) throws Exception {
        Table table = new Table();

        new Thread(new Cook(table), "COOK1").start();
        new Thread(new Customer(table, "donut"),  "CUST1").start();
        new Thread(new Customer(table, "burger"), "CUST2").start();

        Thread.sleep(2000);
        System.exit(0);
    }
}
