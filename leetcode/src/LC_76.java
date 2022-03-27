import java.util.HashMap;

public class LC_76 {
    public void main() {
        String s = "ebbancf";
        String t = "abc";
        String r = minWindow1(s,t);
        System.out.println(r);
    }


     String minWindow(String s,String t){
        char[] ss = s.toCharArray();
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int valid = 0;
        int start = 0, len = Integer.MAX_VALUE;
        for (char c: t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        while (right < ss.length){
            char c = ss[right];
            right++;
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if (need.get(c) == window.get(c))
                    valid ++ ;
            }
            while (valid == need.size()){
                if (right - left < len){
                    start = left;
                    len = right - left;
                }
                char d = ss[left];
                left ++;
                if (need.containsKey(d)){
                    if (window.get(d) == need.get(d))
                        valid--;
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return len==Integer.MAX_VALUE? "":s.substring(start,start+len);
    }
    //第一次
    //不足： 注意在左右侧更新window时，在右边界移动时应先加1再判断   在左边界移动时应先判断再减1
    //Integer为对象，会缓存-128到127的值，所以在比较数值时应该使用equals而不是==
    //第二次
    //不足： 注意循环在收缩左边时是循环进行！因为此时已经满足条件，所以进行更新start和length。
    //在valid--后再更新窗口中的值
    String minWindow1(String s,String t){
        int left = 0, right=0;
        int valid=0;
        int start = 0, len = Integer.MAX_VALUE;
        HashMap<Character,Integer> need = new HashMap<>();
        HashMap<Character,Integer> window = new HashMap<>();
        char[] sChar = s.toCharArray();
        for (char c:t.toCharArray()){
            need.put(c,need.getOrDefault(c,0)+1);
        }
        while (right<s.length()){
            char c = sChar[right];
            right++;
            if (need.containsKey(c)){
                window.put(c,window.getOrDefault(c,0)+1);
                if (need.get(c).equals(window.get(c)))
                    valid++;
            }
            while (need.size() == valid){
                if (right - left < len){
                    start = left;
                    len = right - left;
                }
                char d = sChar[left];
                left++;
                if (need.containsKey(d)){
                    if (need.get(d).equals(window.get(d)))
                        valid--;
                    window.put(d,window.get(d)-1);
                }
            }
        }
        return len == Integer.MAX_VALUE?"":s.substring(start,start+len);
    }
}

