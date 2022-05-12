import java.util.LinkedList;
import java.util.List;

public class LC_46 {
    List<List<Integer>> res = new LinkedList<>();
    LinkedList track = new LinkedList();
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
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
            if (used[i]) continue;
            used[i] = true;
            track.addLast(nums[i]);
            backtrack(nums);
            used[i] = false;
            track.removeLast();
        }
    }
}
