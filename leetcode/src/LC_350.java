import javax.naming.LinkLoopException;
import java.util.*;

public class LC_350 {
    public static void main(String[] args) {
        int[] n1 = {1,2,2,1};
        int[] n2 = {2,2};
        intersect(n1,n2);

    }
    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map1 = new HashMap();
        for (int i=0;i<nums1.length;i++){
            map1.put(nums1[i], map1.getOrDefault(nums1[i], 0) + 1);
        }
        Map<Integer,Integer> map2 = new HashMap();
        for (int i=0;i<nums2.length;i++) {
            map2.put(nums1[i], map2.getOrDefault(nums1[i], 0) + 1);
        }
        int cnt=0;
        ArrayList<Integer> res = new ArrayList();
        for (Integer key:map1.keySet()
             ) {
            if (map2.containsKey(key)){
                int min = Math.min(map1.get(key),map2.get(key));
                while ((min--)!=0){
                    res.add(key);
                    cnt++;
                }
            }
        }
        int[] ans = new int[cnt];
        cnt = 0;
        for (int cur:res
             ) {
            ans[cnt++] = cur;
        }
        return ans;
    }
}
