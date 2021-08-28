import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC_18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i=0;i<nums.length-3;i++){

            if (nums[i]>target) continue;

            for (int left1 = i+1;left1<nums.length-2;left1++){

                if (i==3 && left1==5)
                    System.out.println("debug");

                if (nums[left1]>target-nums[i])
                    break;
                if (left1>i+1 && nums[left1]==nums[left1-1])
                    continue;
                int left2 = left1+1;
                int right = nums.length-1;
                while (left2<right){
                    if(nums[i]+nums[left1]+nums[left2]+nums[right]>target)
                        right--;
                    else if (nums[i]+nums[left1]+nums[left2]+nums[right]<target)
                        left2++;
                    else {
                        List<Integer> toAdd = new ArrayList<>();
                        toAdd.add(nums[i]);
                        toAdd.add(nums[left1]);
                        toAdd.add(nums[left2]);
                        toAdd.add(nums[right]);
                        res.add(toAdd);
                        while (left2<right && nums[right]==nums[right-1])   right--;
                        while (left2<right && nums[left2]==nums[left2+1])   left2++;
                        right--;
                        left2++;
                    }
                }
            }


        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums ={1,-2,-5,-4,-3,3,3,5};
        int target = -11;
        List<List<Integer>> res =  fourSum(nums,target);
        System.out.println();
    }
}
