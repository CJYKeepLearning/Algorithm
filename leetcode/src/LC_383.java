import java.util.HashMap;
import java.util.Map;

public class LC_383 {
/**     use Map */
/*
        public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()==0)
            return true;
        else if (magazine.length()==0)
            return false;
        Map<Character,Integer> map = new HashMap<>();
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();

        for (int i=0;i<mag.length;i++){
            map.put(mag[i],map.getOrDefault(mag[i],0)+1);
        }
        for (int i=0;i<ran.length;i++){
            if (map.containsKey(ran[i])){
                int k = map.get(ran[i]);
                k--;
                if(k<0)
                    return false;
                else{
                    map.put(ran[i],k);
                }
            }else
                return false;
        }
        return true;
    }*/
/** use array*/
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length()==0)
            return true;
        else if (magazine.length()==0)
            return false;

        int[] flag = new int[26];
        char[] ran = ransomNote.toCharArray();
        char[] mag = magazine.toCharArray();
        for (int i=0;i<mag.length;i++){
            flag[mag[i]-97]++;
        }
        for (int i=0;i<ran.length;i++){
            flag[ran[i]-97]--;
            if (flag[ran[i]-97]<0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "aa";
        String b = "ab";
        if (canConstruct(a,b))
            System.out.println("yes");
        else
            System.out.println("No");
    }
}
