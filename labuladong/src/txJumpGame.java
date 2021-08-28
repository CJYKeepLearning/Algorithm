import java.lang.reflect.Array;
import java.util.Arrays;

public class txJumpGame {
    //jumpGame1
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        int farthest = 0;
        for (int i = 0; i < n - 1; i++) {
            // 不断计算能跳到的最远距离
            farthest = Math.max(farthest, i + nums[i]);
            // 可能碰到了 0，卡住跳不动了
            if (farthest <= i) return false;
        }
        return farthest >= n - 1;
    }
    //jumpGame2
    //use the least step
    public static int[] memo;
    public static int jumpGame2(int[] nums){
        int n = nums.length;
        memo = new int[n];
        Arrays.fill(memo,n);
        //定义：从索引 p 跳到最后一格，至少需要 dp(nums, p) 步,求dp(nums,0)
        return tx(nums,nums.length-1);
    }
/*      动态规划
        public static int dp(int[] nums,int p){
        int n = nums.length;
        if ( p>= n -1 )
            return 0;
        if (memo[p] != n)
            return memo[p];
        int steps = nums[p];
        for (int i=1;i<=steps;i++){
            int subProblem = dp(nums,p+i);
            memo[p] = Math.min(memo[p],subProblem+1);
        }
        return memo[p];
    }*/
    public static int tx(int[] nums,int p){
        int n = nums.length;
        int end = 0,farthest = 0;
        int jumps = 0;
        for (int i=0;i<n-1;i++){
            farthest = Math.max(nums[i]+i,farthest);
            if (end == i){
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}
