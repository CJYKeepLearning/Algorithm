import java.lang.reflect.Array;
import java.util.Arrays;

public class dp0_1Backpack {
/*    public static int solution(int W,int N,int[] wt,int[] val){
        //dp[i][w]定义：对于前i个物品，当前背包的容量为w，这种情况下可以装的最大价值是dp[i][w]
        int[][] dp = new int[N+1][W+1];
        Arrays.fill(dp[0],0);
        for (int i=0;i<N+1;i++)
            dp[i][0] = 0;
        for (int i=1;i<N+1;i++){
            for (int w=1;w<W+1;w++){
                int put = val[i-1]+dp[i-1][w-wt[i-1]];
                int noput = dp[i-1][w];
                dp[i][w] = Math.max(put,noput);
            }
        }
        return dp[N][W];
    }*/
    public static int backPack(int amount,int N,int[] wt,int[] val){
        int n = wt.length;
        //dp[i][w]使用前i个物品，当背包容量为w时，这种情况下可以装的最大价值是dp[i][w]
        int[][] dp = new int[n+1][amount+1];
        for (int i=0;i<=amount;i++){
            dp[0][i] = 0;
        }
        for (int w=0;w<=n;w++){
            dp[w][0] = 0;
        }
        for (int i=1;i<=n;i++){
            for (int w = 1;w<=amount;w++){
                if (w-wt[i-1]<0)
                    //当前背包容量放不下，只能选择不装入！
                    dp[i][w] = dp[i-1][w];
                else {
                    int put = val[i-1] + dp[i-1][w-wt[i-1]];
                    int noput = dp[i-1][w];
                    dp[i][w] = Math.max(put,noput);
                }
            }
        }
        return dp[n][amount];
    }
}
