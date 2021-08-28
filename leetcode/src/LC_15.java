import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class LC_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for (int i=0;i<nums.length;i++){    //i从开始到结束
            if (nums[i]>0)  //如果最小的大于0
                return res;
            if (i>0 &&nums[i] == nums[i-1]){    //i中遇到重复的，可跳过第二个。
                continue;
            }
            int left = i+1;
            int right = nums.length-1;
            while (left<right){ //单次过程，每个数字只取一次，递增排序，right从右向左，left从左到右相加不满足，结束。
                if (nums[i]+nums[left]+nums[right]>0){
                    right--;
                }else if (nums[i]+nums[left]+nums[right]<0)
                    left++;
                else {
                    List<Integer> toAdd = new ArrayList<>();
                    toAdd.add(nums[i]);
                    toAdd.add(nums[left]);
                    toAdd.add(nums[right]);
                    res.add(toAdd);
                    while (right>left && nums[right]==nums[right-1]) right--;   //去重
                    while (right>left && nums[left]==nums[left+1]) left++;     //去重
                    right--;
                    left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,0,1};
        List<List<Integer>> res = threeSum(nums);
    }
}
