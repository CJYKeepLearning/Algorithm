import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC_40 {
    List<List<Integer>> res = new LinkedList<>();
    // 记录回溯的路径
    LinkedList<Integer> track = new LinkedList<>();
    boolean[] used;
    List<List<Integer>> permuteUnique(int[] nums){
        Arrays.sort(nums);
        used = new boolean[nums.length];
        backtrack(nums);
        return res;
    }

    private void backtrack(int[] nums) {
        if (track.size() == nums.length){
            res.add(new LinkedList<>(track));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (used[i])
                continue;
            // 新添加的剪枝逻辑，固定相同的元素在排列中的相对位置
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                // 如果前面的相邻相等元素没有用过，则跳过
                continue;
            }
            // 选择 nums[i]
            track.addLast(nums[i]);
            used[i] = true;
            backtrack(nums);
            track.removeLast();
            used[i] = false;
        }
    }
}
