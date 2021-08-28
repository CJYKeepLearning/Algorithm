import java.util.*;

public class LC_451 {
   public String frequencySort(String s) {
       Map<Character,Integer> map = new TreeMap<>();
       char[] chars = s.toCharArray();
       for (int i=0;i<chars.length;i++){
           map.put(chars[i],map.getOrDefault(chars[i],0)+1);
       }
       List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue()-o1.getValue();
            }
        });
        StringBuffer stringBuffer = new StringBuffer();
       for(Map.Entry<Character,Integer> mapping:list){
           for (int i=0;i<mapping.getValue();i++)
           stringBuffer.append(mapping.getKey());
       }
       return stringBuffer.toString();
   }
}
