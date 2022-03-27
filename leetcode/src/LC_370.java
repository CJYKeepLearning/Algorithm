public class LC_370 {
    public int[] getModifiedArray(int length, int[][] updates){
        int[] nums = new int[length];
        Diff df = new Diff(nums);
        for (int[] update : updates){
            df.inc(update[0],update[1],update[2]);
        }
        return nums;
    }
}
class Diff{
    public int[] diff;

    public Diff(int[] nums) {
        assert nums.length>0;
        diff = new int[nums.length];
        diff[0] = nums[0];
        for (int i=1;i<nums.length;i++){
            diff[i] = nums[i] - nums[i-1];
        }
    }
    public void inc(int i, int j, int val){
        diff[i] += val;
        if (j + 1 < diff.length){
            diff[j+1] -= val;
        }
    }
    public int[] result(){
        int[] res = new int[diff.length];
        res[0] = diff[0];
        for (int i=1;i<diff.length;i++){
            res[i] = res[i-1] + diff[i];
        }
        return res;
    }
}