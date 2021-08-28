public class ALGO_381 {
    public static void main(String[] args) {
        fun(39,0);
        System.out.println(num);
    }
    public static int num=0;
    public static void fun(int n,int step)//n表示有多少台阶数 ，step表示步数
    {
        if(n<0)
            return;
        if(n==0)
        {
            if(step%2==0) num++;
            return;
        }
        fun(n-1,step+1);
        fun(n-2,step+1);
    }
}
