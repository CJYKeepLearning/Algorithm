public class LC_303 {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1,2,3,4});
        System.out.println(numArray.sumRange(0,3));
    }
}
class NumArray {
    private int[] nums;
    private int[] sums;

    public NumArray(int[] nums) {
        this.nums = nums;
        sums = new int[nums.length];
        sums[0] = nums[0];
        if (nums.length != 1){
            for (int i=1;i<nums.length;i++){
                sums[i] = nums[i]+sums[i-1];
            }
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return sums[right];
        return sums[right] - sums[left-1];
    }
}
class NumArray1 {
    // 前缀和数组
    private int[] preSum;
    /* 输⼊⼀个数组，构造前缀和 */
    public NumArray1(int[] nums) {
// preSum[0] = 0，便于计算累加和
        preSum = new int[nums.length + 1];
// 计算 nums 的累加和
        for (int i = 1; i < preSum.length; i++) {
            preSum[i] = preSum[i - 1] + nums[i - 1];
        }
    }
    /* 查询闭区间 [left, right] 的累加和 */
    public int sumRange(int left, int right) {
        return preSum[right + 1] - preSum[left];
    }
}