import java.util.Arrays;
import java.util.HashMap;

public class LC_698 {
    /* 以桶的视角
    boolean canPartionKSubsets(int[] nums,int k){
        if ( k >nums.length) return false;
        int sum = 0;
        for (int i:nums) sum += i;
        if (sum % k != 0) return false;
        int target = sum / k;
        int[] bucket = new int[k];
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            // 交换 nums[i] 和 nums[j]
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        return backtrack(nums,0,bucket,target);
    }

    private boolean backtrack(int[] nums, int index, int[] bucket, int target) {
        if (index == nums.length){
            for (int i=0;i<bucket.length;i++){
                if (bucket[i] != target){
                    return false;
                }
            }
            return true;
        }
        for (int i=0;i<bucket.length;i++){
            if (bucket[i] + nums[index] > target) continue;
            bucket[i] += nums[index];
            if (backtrack(nums,index+1,bucket,target)) return true;
            bucket[i] -= nums[index];
        }
        return false;
    }
     */
    boolean canPartionKSubsets(int[] nums,int k){
        if (k > nums.length) return false;
        int sum = 0;
        for (int i:nums
             ) {
            sum += i;
        }
        if (sum % k != 0) return false;
        int target = sum / k;
        boolean[] used = new boolean[nums.length];
        return backtrack(k,0,nums,0,used,target);
    }
    HashMap<String,Boolean> memo = new HashMap<>();
    private boolean backtrack(int k, int bucket, int[] nums, int start, boolean[] used, int target) {
        if (k == 0) return true;
        String state = Arrays.toString(used);

        if (bucket == target){
            boolean res = backtrack(k-1, 0, nums, start, used,target);
            memo.put(state,res);
            return res;
        }
        if (memo.containsKey(state)) return memo.get(state);
        for (int i=start;i<nums.length;i++){
            if (used[i]) continue;
            if (nums[i] + bucket > target) continue;
            used[i] = true;
            bucket += nums[i];
            if (backtrack(k, bucket, nums, i+1, used, target)) return true;
            used[i] = false;
            bucket -= nums[i];
        }
        return false;
    }
}
