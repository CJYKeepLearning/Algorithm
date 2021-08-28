import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AccountWithoutSync {
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
/*            synchronized (account){
                account.deposit(1);
            }*/
            account.deposit(1);
        }
    }
    private static class Account {
        private int balance=0;

        public int getBalance() {
            return balance;
        }

/*        public void deposit(int amount) {
            int newBalance = balance+ amount;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
        }*/
        public synchronized void deposit(int amount) {
            int newBalance = balance+ amount;
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
        }
    }
}

