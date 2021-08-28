public class dpCompleteBackPack {
    //零钱兑换Ⅱ，完全背包问题
/*    public static int change(int amount,int[] coins){
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        for (int i=0;i<=n;i++)
            dp[i][0] = 1;

        for (int i=1;i<n;i++){
            for (int j=1;j<=amount;j++)
                if (j-coins[i-1] >=0 )
                    dp[i][j] = dp[i-1][j] + dp[i][j-coins[i-1]];
                else
                    dp[i][j] = dp[i-1][j];
        }
        return dp[n][amount];
    }*/
    //状态压缩
    public static int change2(int amount,int[] coins){
        int n = coins.length;
        int[] dp = new int[n+1];
        dp[0] = 1;
        for (int i=0;i<n;i++){
            for (int j = 1;j<=amount;j++){
                if (j-coins[i]<0)
                    dp[j] = dp[j];
                else
                    dp[j] = dp[j]+dp[j-coins[i]];
            }
        }
        return dp[amount];
    }
    //与1相同，用作练手而已
    public static int change3(int amount,int[] coins){
        //dp[i][j]=x代表使用前i个种类的钱，有x种方法凑成j元
        //选择：dp[i][j] = dp[i-1][j]+dp[i][j-coins[i-1]];
        int n = coins.length;
        int[][] dp = new int[n+1][amount+1];
        //base case 为dp[0][..] = 0， dp[..][0] = 1。
        // 因为如果不使用任何硬币面值，就无法凑出任何金额；
        // 如果凑出的目标金额为 0，那么“无为而治”就是唯一的一种凑法。
        //base case
        for (int i=0;i<=n;i++)
            dp[i][0] = 1;
        for (int i=0;i<=amount;i++)
            dp[0][i] = 0;
        //dp
        for (int i=1;i<=n;i++){
            for (int j=1;j<=amount;j++){
                if (j-coins[i-1]<0)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j]+dp[i][j-coins[i-1]];
            }
        }
        return dp[n][amount];
    }
}
