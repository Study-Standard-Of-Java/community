package chapter13.synchronizedP;

class Account {
    public int balance = 1000;

    public synchronized void withDraw(int money) {
        if (balance >= money) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            this.balance -= money;
        }
    }

}

class ThreadBalance implements Runnable {

    Account account;

    public ThreadBalance(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        while (account.balance > 0) {
            int money = (int) (Math.random() * 4 + 1) * 100;
            account.withDraw(money);
            System.out.println("account.balance = " + account.balance);
        }
    }
}
public class NoSynchronized {
    public static void main(String[] args) {
        Account account = new Account();
        Runnable runnable = new ThreadBalance(account);
        new Thread(runnable).start();
        new Thread(runnable).start();

    }
}

