import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
public class BlockingSynchronizedThread {
    //定义阻塞队列实现线程同步
    private LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue <Integer>();
    private static final int size = 10;
    private int flag = 0;
    private class LinkBlockThread implements Runnable
    {
        public void run()
        {
            int new_flag = flag++;
            System.out.println("启动线程" + new_flag);
            if(new_flag == 0)
            {
                for(int i = 0; i < size; i++)
                {
                    int b = new Random().nextInt(255);
                    System.out.println("生产商品：" + b + "号");
                    try
                    {
                        queue.put(b);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }

                    System.out.println("仓库中还有商品：" + queue.size() + "个");

                    try
                    {
                        Thread.sleep(100);
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }

            else
            {
                for(int i =0; i < size / 2; i++)
                {
                    try
                    {
                        int n = queue.take();
                        System.out.println("消费者买去了" + n + "号商品");
                    }
                    catch(InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                    System.out.println("仓库中还有商品：" + queue.size() + "个");
                    try
                    {
                        Thread.sleep(100);
                    }
                    catch(Exception e)
                    {}
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BlockingSynchronizedThread bst = new BlockingSynchronizedThread();
        LinkBlockThread lbt = bst.new LinkBlockThread();
        Thread thread1 = new Thread(lbt);
        Thread thread2 = new Thread(lbt);
        thread1.start();
        thread2.start();
    }

}
