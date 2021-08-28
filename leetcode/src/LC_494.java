import java.util.LinkedList;

public class LC_494 {
    public  int findTargetSumWays(int[] nums, int target) {
        if (nums.length==0)
            return res;
        else {
            dfs(nums, 0, 0, target);
            return res;
        }
    }
    int res = 0;
    void dfs(int[] nums,int index,int sum,int target){
        if (sum==target && index==nums.length){
            res++;
            return;
        }
        if (index==nums.length)
            return;
        //选择加法：
        sum+=nums[index];
        dfs(nums,index+1,sum,target);
        sum-=nums[index];
        //选择减法：
        sum-=nums[index];
        dfs(nums,index+1,sum,target);
        sum+=nums[index];
    }
}
