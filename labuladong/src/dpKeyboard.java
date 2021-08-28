import java.util.Arrays;

public class dpKeyboard {
    //方法一：
    //状态:剩余的按键次数，用n表示；
    //    当前字符数量，用a_num表示，
    //    剪切板中字符数量，用copy表示
    //状态转移方程：
    //会超时
    public static int fourKey1(int N){
        return dp1(N,0,0);
    }
    public static int dp1(int n,int a_num,int copy){
        if (n<=0)
            return a_num;
        return Math.max(dp1(n-1,a_num+1,copy),Math.max(dp1(n-1,a_num
        +copy,copy),dp1(n-2,a_num,a_num)));
    }
    //方法二：
    //dp[i]表示i次操作后，最多能显示几个A
    //我与方法二的区别，最大的时候考虑不全面，按A键与赋值健没考虑全面。
    //主要理所当然的认为最后一个是粘贴健，且前面是全选复制了，其实不然。可以全选复制粘贴粘贴，多个粘贴、
    public static int[] dpArr;
    public static int fourKey2(int N){
        dpArr = new int[N+1];
        dpArr[0] = 0;
        for (int i=1;i<=N;i++){
           //按A键
            dpArr[i] = dpArr[i-1]+1;
            for (int j=2;j<i;j++){
                //全选复制dp[j-2]，连续粘贴i-j次
                dpArr[i] = Math.max(dpArr[i],dpArr[j-2]*(i-j+1));
            }
        }
        return dpArr[N];
    }
    public static void main(String[] args) {
        int N=10;
        int ans = fourKey2(N);
        System.out.println(ans);
    }
}
