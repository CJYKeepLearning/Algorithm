import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class LC_198 {
    public static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        int[] path = new int[nums.length];

        dp[0] = nums[0]; path[0] = 1;

        dp[1] = Math.max(dp[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2] + nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        int res = rob(nums);
        System.out.println(res);
    }
}
