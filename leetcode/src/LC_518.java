import java.util.LinkedList;
import java.util.List;

public class LC_518 {
    // 超时
    /*
    int res;
    int sum = 0;
    int change(int amount, int[] coins){
        backtrack(coins,amount,0);
        return res;
    }

    private void backtrack(int[] coins, int amount, int start) {
        if (sum == amount){
            res++;
            return;
        }
        if (sum > amount)
            return;
        for (int i=start;i<coins.length;i++){
            sum += coins[i];
            backtrack(coins, amount, i);
            sum -= coins[i];
        }
    }
     */
    int change(int amount, int[] coins){
        // dp[i][a] 在amount 情况下 对于前 i个 coin 有dp[i][a]中方式
        // 明确选择 dp[i][amount-coins[i]]
        int[][] dp = new int[coins.length+1][amount+1];
        for (int i = 0; i <= coins.length; i++)
            dp[i][0] = 1;
        for (int i = 1; i <=coins.length ; i++) {
            for (int j=1;j<=amount;j++){
                if (j - coins[i-1] >= 0){
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                } else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[coins.length][amount];
    }
}
