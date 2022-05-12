import java.util.HashMap;

public class Review {
    String Search(String S,String T){
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        for (char c:t
             ) {
            need.put(c,need.getOrDefault(c,0)+1);
        }
        int left = 0, right = 0;
        int length = Integer.MAX_VALUE;
        int start = 0;
        int count = 0;
        while (right < s.length){
            char r = s[right];
            right ++;
            if (need.containsKey(r)){
                window.put(r,window.getOrDefault(r,0)+1);
                if (window.get(r).equals(need.get(r))){
                    count++;
                }
            }
            while (count == need.size()){
                if (right - left < length){
                    start = left;
                    length = right-left;
                }
                char l = s[left];
                left++;
                if (need.containsKey(l)){
                    if (window.get(l) .equals(need.get(l))){
                        count --;
                    }
                    window.put(l,window.get(l)-1);
                }
            }
        }
        return length==Integer.MAX_VALUE?"":S.substring(start,start+length);
    }
}
