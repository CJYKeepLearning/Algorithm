import java.util.HashSet;
import java.util.Scanner;

public class JavaB192 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet res = new HashSet();
        for (int i = 0; i< s.length();i++){
            for (int j = s.length();j>=i;j--){
                String t = s.substring(i,j);
                res.add(t);
            }
        }
        int num = res.size();
        System.out.println(num);
    }
}
