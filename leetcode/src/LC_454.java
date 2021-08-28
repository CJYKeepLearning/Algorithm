import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LC_454 {
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int count=0;
        Map<Integer,Integer> map1 = new HashMap<>();
        for (int a:A){
            for (int b:B){
                map1.put(a+b,map1.getOrDefault(a+b,0)+1);
            }
        }
        Map<Integer,Integer> map2 = new HashMap<>();
        for (int c:C){
            for (int d:D){
                if (map1.containsKey(-(c+d))){
                    count +=map1.get(-(c+d));
                }
            }
        }
       /* for (int i=0;i<map1.size();i++){
            if ()
        }
        */
/*      Set entrySet1 = map1.entrySet();
        Set entrySet2 = map2.entrySet();
        for (Iterator iter1 = entrySet1.iterator();iter1.hasNext();){
            Map.Entry entry1 = (Map.Entry)iter1.next();
            for (Iterator iter2 = entrySet2.iterator();iter2.hasNext();){
                Map.Entry entry2 = (Map.Entry)iter2.next();
                if ((int)entry1.getKey()+(int)entry2.getKey()==0){
                    count += (int)entry1.getValue()*(int)entry2.getValue();
                }
            }
        }*/
        return count;
    }

    public static void main(String[] args) {
        int[] A={-1,-1};
        int[] B={-1,1};
        int[] C={-1,1};
        int[] D={1,-1};
        int i = fourSumCount(A,B,C,D);
        System.out.println(i);
    }
}
