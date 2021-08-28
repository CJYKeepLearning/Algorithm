import java.io.StreamTokenizer;

public class LC_242 {
    public static boolean isAnagram(String s, String t) {
        int[] count = new int[26];
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        if (chars.length!=chart.length) return false;
        for (int i=0;i<chars.length;i++){
            int j =(int)chars[i] - 97;
            count[j]++;
        }
        for (int i=0;i<chart.length;i++){
            int j = (int)chart[i] - 97;
            if(count[j]==0)
                return false;
            count[j]--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s ="anagram", t = "nagaram";
        if (isAnagram(s,t))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
