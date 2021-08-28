import org.omg.PortableInterceptor.INACTIVE;

import java.util.LinkedList;

public class ALGO_backtrack {
    public static LinkedList<LinkedList<Integer>> res = new LinkedList<LinkedList<Integer>>();
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        solve(nums);
        for (LinkedList<Integer> list:res) {
            for (int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void solve(int[] nums){
        LinkedList track = new LinkedList();
        backtrack(nums,0,track);
    }

    public static void backtrack(int[] nums,int start,LinkedList track){
        res.add(new LinkedList<>(track));
        for (int i=start;i<nums.length;i++){
            if (track.contains(nums[i]))
                continue;
            track.add(nums[i]);
            backtrack(nums,i+1,track);
            track.removeLast();
        }
    }
}
