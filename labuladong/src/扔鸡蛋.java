import javax.swing.*;

public class 扔鸡蛋 {
    public static void main(String[] args) {
        int K=1,N=1;
        int[][] dp = new int[N+1][K+1];
        for(int i=1;i<=N;i++){
            for (int n=1;n<=N;n++){
                for (int k=1;k<=K;k++){
                    dp[n][k] = Math.max(dp[n-i][k],dp[n-1][k-1]);
                }
            }
        }
    }
    static int[][] memo;
    static int eggs(int K,int N){
        if (K==1)
            return N;
        if (N==0)
            return 0;
        if (memo[K][N]!=0)
            return memo[K][N];
        int res = Integer.MAX_VALUE;
        for (int i=1;i<=N;i++){
            res = Math.min(res,Math.max(eggs(K,N-i),eggs(K-1,i-1)));
        }
        memo[K][N] = res;
        return res;
    }

}
