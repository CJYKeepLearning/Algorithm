public class dp1 {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins,amount));
    }
/*    public static int coinChange(int[] coins,int amount){
        if (amount<=0) return 0;
        int ans = Integer.MAX_VALUE;
        for (int i=0;i<coins.length;i++) {
            int count =1+coinChange(coins,amount-coins[i]);
            if (count<ans)
                ans = count;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }*/
/*    public static int coinChange(int[] coins,int amount){
        if (amount==0) return 0;
        int ans =Integer.MAX_VALUE;
        for (int coin:coins){
            if (amount-coin<0) continue;
            int subProb = coinChange(coins,amount-coin);
            if (subProb==-1) continue;
            ans = Math.min(ans,subProb+1);
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }*/
/*    //带备忘录的递归算法
    public static int coinChange(int[] coins,int amount){
        int[] memo = new int[amount+1];
        for (int m:memo){m=-2;}
        return helper(coins,amount,memo);
    }
    public static int helper(int[] coins,int amount,int[] memo){
        if (amount==0) return 0;
        if (memo[amount]!=-2) return memo[amount];
        int ans = Integer.MAX_VALUE;
        for (int coin:coins){
            if (amount-coin<0) continue;
            int subPro = helper(coins,amount-coin,memo);
            if (subPro==-1) continue;
            ans = Math.min(ans,subPro+1);
        }
        memo[amount] = (ans==Integer.MAX_VALUE)?-1:ans;
        return memo[amount];
    }*/
    //DP解决
    public static int coinChange(int[] coins,int amount){
        int[] dp=new int[amount+1];
        for (int i=1;i<dp.length;i++)
            dp[i] = amount+1;
        dp[0] = 0;
        for (int i=0;i<dp.length;i++){
            for (int coin:coins){
                if (coin>i) continue;
                 dp[i] =Math.min(dp[i],1+dp[i-coin]);
            }
        }
        return dp[amount]==amount+1?-1:dp[amount];
    }

}
