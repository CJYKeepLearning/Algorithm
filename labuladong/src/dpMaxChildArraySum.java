/*
* 定义以nums[i]为结尾的   最大子数组和  /   最长递增子序列
* */

public class dpMaxChildArraySum {
    public static void main(String[] args) {

    }
    public static int maxSubArray(int[] nums){
        int n = nums.length;
        if (n==0) return 0;
        int[] dp = new int[n];
        dp[0] = nums[0];    //记录以nums[i]为结尾的，最大子数组之和
        for (int i=1;i<n;i++){
            dp[i] = Math.max(nums[i],nums[i]+dp[i-1]);
        }
        int res = Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            res = Math.max(res,dp[i]);
        }
        return res;
    }
    public static int maxSubArrayCompress(int[] nums){
        int n = nums.length;
        if (n==0) return 0;
        int dp_0 = nums[0];
        int dp_1 = 0,res = dp_0;
        for (int i=1;i<n;i++){
            dp_1 = Math.max(nums[i],nums[i]+dp_0);
            dp_0 = dp_1;
            res = Math.max(res,dp_1);
        }
        return res;
    }
}
