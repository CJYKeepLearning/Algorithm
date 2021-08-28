import java.util.HashSet;

public class ALGO_2019_2 {
    public static void main(String[] args) {
        String s = "0100110001010001";
        int cnt=0;
        HashSet<String> res = new HashSet<>();
        for (int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                String temp = s.substring(i,j+1);
                if (!res.contains(temp)){
                  cnt++;
                  res.add(temp);
                }
            }
        }
        System.out.println(cnt);
    }
}
