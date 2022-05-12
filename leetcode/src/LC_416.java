public class LC_416 {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int i:nums
        ) {
            sum += i;
        }
        if (sum % 2 !=0 ) return false;
        int k = sum/2;
        boolean[][] dp = new boolean[nums.length+1][k+1];
        for (int i = 0; i <= nums.length; i++)
            dp[i][0] = true;
        for (int i = 1; i < dp.length; i++) {
            for(int j=1;j < dp[i].length;j++){
                if (j-nums[i-1] < 0){
                    dp[i][j] = dp[i-1][j];
                }else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i]];
            }
        }
        return dp[nums.length][k];
    }
}
