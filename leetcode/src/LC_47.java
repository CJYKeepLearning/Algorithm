import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC_47 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList track = new LinkedList();
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
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
        for (int i = 0;i<nums.length;i++){
            // 判断nums[i] 与nums[i-1] 这样可以保证连续相同的第一个数能正常执行，
            // 但是后面的就不会执行了
            if (i > 0 && (nums[i] == nums[i-1])) continue;
            used[i] = true;
            track.addLast(nums[i]);
            backtrack(nums);
            used[i] = false;
            track.removeLast();
        }
    }
}
