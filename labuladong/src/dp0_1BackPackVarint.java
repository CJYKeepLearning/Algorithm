public class dp0_1BackPackVarint {
    //leetcode416分割等和子集
/*    public static boolean canPartition(int[] nums){
        int sum=0;
        for (int num:nums) sum+=num;
        if(sum%2 !=0) return false;
        sum = sum/2;
        int n = nums.length;
        //dp数组：`dp[i][j] = x`表示，对于前`i`个物品，当前背包的容量为`j`时，
        // 若`x`为`true`，则说明可以恰好将背包装满
        // 若`x`为`false`，则说明不能恰好将背包装满
        boolean[][] dp = new boolean[n][sum+1];
        for (int i=0;i<=n;i++)
            dp[i][0] = true;//这里没懂
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sum;j++){
                if (j-nums[i-1]<0)
                    dp[i][j] = dp[i-1][j];
                else {
                    dp[i][j] = dp[i-1][j] | dp[i-1][j-nums[i-1]];
                }
            }
        }
        return dp[n][sum];
    }*/
    //状态压缩
    public static boolean canPartition2(int[] nums){
        int sum = 0;
        for (int n:nums){
            sum += n;
        }
        if (sum%2!=0)
            return false;
        sum = sum/2;
        int n = nums.length;
        //base case
        boolean[] dp = new boolean[sum+1];
        dp[0] = false;
        //状态压缩，每次都是只需要二维数组的上一层值来更新成本次，所以变成一维数组即可、
        for (int i=0;i<n;i++){
            for (int j=sum;j>=0;j--){
                if (j-nums[i] >= 0)
                    dp[j] = dp[j] || dp[j-nums[i]];
            }
        }
        return dp[sum];
    }
    public static boolean canPartion3(int[] nums){
        //定义dp[i][j]对于前i个元素，能够正好凑成j为true,否则为false
        //状态转移：把i放入：看dp[i-1][j-nums[i-1]],或者不放入i看dp[i-1][j]
        //base case。dp[...][0] = false;
        int sum = 0;
        for (int n:nums){
            sum += n;
        }
        if (sum%2!=0)
            return false;
        sum = sum/2;
        int n = nums.length;
        //base case
        boolean[][] dp = new boolean[n+1][sum+1];
        for (int i=0;i<sum+1;i++)
            dp[0][i] = false;
        for (int i=0;i<n+1;i++)
            dp[i][0] = true;

        for (int i=1;i<=n;i++){
            for (int j=1;j<=sum;j++){
                if (j-nums[i-1]<0)
                    dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = dp[i-1][j-nums[i-1]] || dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
}
