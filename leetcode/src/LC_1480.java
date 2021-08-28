public class LC_1480 {
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        int[] ans = runningSum(nums);
        for (int i:ans
             ) {
            System.out.println(i);
        }
    }
    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;
        for (int i=0;i<nums.length;i++){
            count += nums[i];
            ans[i] = count;
        }
        return ans;
    }
}
