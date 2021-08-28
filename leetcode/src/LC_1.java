import java.util.HashMap;
import java.util.Map;

public class LC_1 {
    public static int[] twoSum(int[] nums, int target) {
        int[] indexs = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                indexs[0] = i;
                indexs[1] = map.get(nums[i]);
                return indexs;
            }
            map.put(target-nums[i],i);
        }
        return indexs;
    }

    public static void main(String[] args) {
        int[] nums = {2,9,7,11,15};
        int target = 9;
        twoSum(nums,target);
    }
}
