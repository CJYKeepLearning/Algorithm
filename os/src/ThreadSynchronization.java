public class ThreadSynchronization {
    public void useThread(){
        Bank bank = new Bank();
        NewThread newthread = new NewThread(bank);

        System.out.println("线程1");
        Thread thread1 = new Thread(newthread);
        thread1.start();

        System.out.println("线程2");
        Thread thread2 = new Thread(newthread);
        thread2.start();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        ThreadSynchronization st = new ThreadSynchronization();
        st.useThread();
    }
    /*
    使用volatile实现线程同步
        class Bank{
        private volatile int account = 100;
        public int getAccount(){
            return account;
        }
        public void sava(int money){
            account  += money;
        }
    }
    * */
    /*
    * 使用ReentrantLock实现线程同步
    * class Bank{
        private int account = 100;
        //声明锁
        private Lock lock = new ReentrantLock();
        public int getAccount(){
            return account;
        }
        public void save(int money){
            lock.lock();
            try{
                account+=money;
            }finally{
                lock.unlock();
            }
        }
    }
    * */

}
class Bank{
    private int account = 100;
    public int getAccount(){
        return account;
    }
    //使用同步方法实现
    public synchronized void sava(int money){
        account  += money;
    }
    //使用同步代码块实现
    public void save1(int money){
        synchronized(this){
            account  += money;
        }
    }
}
//使用Runnable创建线程类
class NewThread implements Runnable{
    private Bank bank;
    public NewThread(Bank bank){
        this.bank = bank;
    }
    public void run(){
        for(int i = 0;i <10; i++){
            bank.sava(10);

        }
    }
}