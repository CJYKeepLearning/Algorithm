import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LC_438 {
    int[] search(String S, String P){
        char[] s = S.toCharArray();
        char[] p = P.toCharArray();
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for (char c:p
             ) {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        List result = new LinkedList();
        int left = 0,right = 0;
        int valid = 0;
        while (right<s.length){
            char r = s[right];
            right++;
            if (need.containsKey(r)){
                window.put(r,window.getOrDefault(r,0)+1);
                if (need.get(r).equals(window.get(r)))
                    valid++;
            }
            while (right-left>=p.length){
                if (valid == need.size()){
                    result.add(left);
                }
                char l = s[left];
                left++;
                if (need.containsKey(l)){
                    if (need.get(l).equals(window.get(l)))
                        valid--;
                    window.put(l,window.get(l)-1);
                }
            }
        }
        int[] res = new int[result.size()];
        Iterator iterator = result.iterator();
        for (int i=0;iterator.hasNext();i++){
            res[i] = (int) iterator.next();
        }
        return res;
    }
}
