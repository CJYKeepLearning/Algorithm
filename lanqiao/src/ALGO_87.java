import java.util.*;

public class ALGO_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        String S = sc.next();
        enumChildString(S,L);
    }
    public static void enumChildString(String S,int L){
        Map<String,Integer> mapStr = new HashMap<String,Integer>();
        int count = 0;
        String childStr = "";
        for (int i=0;i<=S.length()-L;i++){
            for (int j=i+L;j<=S.length();j++){
                String s = S.substring(i,j);
                mapStr.put(s,mapStr.getOrDefault(s,0)+1);
            }
        }
        Set entrySet = mapStr.entrySet();
        for (Iterator i = entrySet.iterator();i.hasNext();){
            Map.Entry<String,Integer> entry = (Map.Entry)i.next();
            if (entry.getValue()>count){
                childStr = entry.getKey();
                count = entry.getValue();
            }
        }
        System.out.println(childStr);
    }
}
