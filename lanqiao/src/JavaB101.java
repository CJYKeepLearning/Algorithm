import java.util.Scanner;

public class JavaB101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        int j = 0;
        for (int i=0;i<chars.length;i++){
            if (chars[i] == chart[j]) j++;
        }
        System.out.println(j);
    }
}
