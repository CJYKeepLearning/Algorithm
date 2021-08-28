import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LC_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i =0;i<nums1.length;i++)
            set1.add(nums1[i]);
        for (int j=0;j<nums2.length;j++)
            set2.add(nums2[j]);
        int k=0;
        for (int item:set1){
            nums1[k] = item;
            k++;
        }
        k=0;
        for (int item:set2){
            nums2[k] = item;
            k++;
        }
        for (int i=0;i<nums1.length;i++){
            for (int j=0;j<nums2.length;j++){
                if (nums1[i] == nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }

        int[] res = new int[set.size()];
        k=0;
        for (int item:set){
            res[k] = item;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        for (int i:intersection(nums1,nums2)){
            System.out.println(i);
        }
    }
}
