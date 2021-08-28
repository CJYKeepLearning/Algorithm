import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LC_347 {
    public static void main(String[] args) {

    }
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int[][] record = new int[1][map.size()];
        Set entrySet = map.entrySet();
        int[] res=new int[1];
        int i=0;
        for (Iterator iter =entrySet.iterator(); iter.hasNext();){
            Map.Entry entry = (Map.Entry)iter.next();
            record[0][i] =(int)entry.getKey();
            record[1][i] = (int)entry.getValue();
            i++;
        }

        return res;
    }
}
