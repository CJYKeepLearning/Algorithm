public class ThreadMutex {
    public void print(int printer,String content)
    {
        synchronized(this)
        {
            System.out.println("Start working for[" +printer+"]");
            Thread.yield();
            System.out.println("===============");
            Thread.yield();
            System.out.println(content);
            Thread.yield();
            System.out.println("===============");
            Thread.yield();
            System.out.println("Work complete for[" +printer+"]\n");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ThreadMutex p = new ThreadMutex();
        for (int i = 0; i < 3; i++) {
            new Thread(new Thread1(p)).start();
        }
    }
    /*
    class Thread1 implements Runnable {
        private int counter = 0;
        private final int id = counter++;
        private ThreadMutex printer;

        public Thread1(ThreadMutex printer) {
            this.printer = printer;
        }

        public void run() {
            printer.print(id, "Content of" + id);
        }
    }
    */
}
class Thread1 implements Runnable
{
    private  int counter=0;
    private final int id=counter++;
    private ThreadMutex printer;
    public Thread1(ThreadMutex printer)
    {
        this.printer=printer;
    }
    public void run()
    {
        printer.print(id, "Content of"+id);
    }
}