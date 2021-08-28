import java.util.Arrays;

public class ALGO_dp {
    public static void main(String[] args) {

    }
    public static int coinChange(int[] coins,int amount){
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for (int i=0;i<dp.length;i++){
            for (int coin:coins){
                if (i<coin) continue;
                dp[i] = Math.min(dp[i],1+dp[i-coin]);
            }
        }
        return (dp[amount] == amount+1) ? -1:dp[amount];
    }
}
