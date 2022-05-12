import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LC_39 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList track = new LinkedList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums,0);
        return res;
    }

    private void backtrack(int[] nums, int start) {
        res.add(new LinkedList<>(track));
        for (int i=start;i<nums.length;i++){
            track.add(nums[i]);
            backtrack(nums,i);
            track.removeLast();
        }
    }
}
