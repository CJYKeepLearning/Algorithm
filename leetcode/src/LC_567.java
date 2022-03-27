import java.util.HashMap;

public class LC_567 {
    Boolean isInvolve(String T,String S){
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        int left = 0, right = 0;
        int valid = 0;
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for (char c:t
             ) {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        while (right<s.length){
            char r = s[right];
            right++;
            if (need.containsKey(r)){
                window.put(r,window.getOrDefault(r,0)+1);
                if (window.get(r).equals(need.get(r)))
                    valid++;
            }
            while (right - left >= t.length){
                if (valid == need.size())
                    return true;
                char d = s[left];
                left++;
                if (need.containsKey(d)){
                    if (window.get(d).equals(need.get(d)))
                        valid--;
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return false;
    }
}
