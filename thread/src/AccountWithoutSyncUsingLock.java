import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AccountWithoutSyncUsingLock {
    private static Account account = new Account();

    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for (int i=0;i<100;i++){
            executor.execute(new AddPeny());
        }
        executor.shutdown();
        while (!executor.isTerminated()){}
        System.out.println("What is balance?"+account.getBalance());
    }

    private static class AddPeny implements Runnable{
        public void run(){
            account.deposit(1);
        }
    }
    private static class Account {
        private int balance=0;
        /////////////////////////
        private static Lock lock = new ReentrantLock();
        public int getBalance() {
            return balance;
        }

        public void deposit(int amount) {
            lock.lock();
            try {
                int newBalance = balance+ amount;
                Thread.sleep(5);
                balance = newBalance;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }finally {
                lock.unlock();
            }

        }

    }
}

