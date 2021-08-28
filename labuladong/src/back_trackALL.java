import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class back_trackALL<vector> {
/*    public static List<LinkedList<Character>> resSubset = new LinkedList<>();
    public static List<LinkedList<Character>> subset(char[] nums){
        LinkedList<Character> trackSubset = new LinkedList();
        trackSubset.push(' ');
        back_trackSubset(nums,0,trackSubset);
        return resSubset;
    }
    public static void back_trackSubset(char[] nums,int start,LinkedList<Character> track){
        resSubset.add(track);
        for (int i=start;i<nums.length;i++){
            track.push(nums[i]);
            back_trackSubset(nums,i+1,track);
            track.remove();
        }
    }

    public static void main(String[] args) {
        char[] nums = {1,2,3};
        subset(nums);
        for (int i=0;i<resSubset.size();i++){
            LinkedList<Character> list = resSubset.get(i);
            for (int j=0;j<list.size();j++){
                char a = list.get(j);
                System.out.println(a+"&");
            }
            System.out.println("分割-----------------");
        }
    }*/
    public static List<List<Integer>> resSubset(int[] nums){
        List<List<Integer>> lists = new ArrayList<>();
        return lists;
    }
}
