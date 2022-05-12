public class LC_121 {

    public static void  maxProfit(int[] prices) {
        // dp[i][0] 到第i天，持有股票时利润
        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        for (int i=1;i<dp.length;i++){
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1]+prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],-prices[i]);
        }
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[i].length;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }
}
