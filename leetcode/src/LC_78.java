import java.util.LinkedList;
import java.util.List;

public class LC_78 {
    List<List<Integer>> res = new LinkedList<>();
    List<List<Integer>> subsets(int[] nums){
        LinkedList track = new LinkedList();
        dfs(nums,0,track);
        return res;
    }

    private void dfs(int[] nums, int i,LinkedList track) {
        res.add(new LinkedList<>(track));
        for (int j=i; j<nums.length; j++){
            if (track.contains(nums[j])) continue;
            track.addLast(nums[j]);
            dfs(nums,j+1,track);
            track.removeLast();
        }
    }
}
