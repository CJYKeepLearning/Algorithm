import java.util.LinkedList;

public class JavaB22C {

    public static void main(String[] args) {
        int[] alp = new int[26];
        String s = "BABBACAC";
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            alp[chars[i]-'A']++;
        }
        LinkedList res = new LinkedList();
        int max = Integer.MIN_VALUE;
        for (int i =0;i<chars.length;i++){
            if (max<alp[i]){
                max = alp[i];
            }
        }
        for (int i =0;i<alp.length;i++){
            if (max==alp[i]){
                res.addLast((char)(i+'A'));
            }
        }
        for (int i=0;i<res.size();i++){
            System.out.print(res.get(i));
        }
    }
}
