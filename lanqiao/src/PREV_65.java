import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PREV_65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        char[] chars = s.toCharArray();
        int[] times = new int[26];
        for (int i=0;i<chars.length;i++){
            times[chars[i]-'a']++;
        }
        int max=Integer.MIN_VALUE;
        char t='0';
        for (int i=0;i<times.length;i++){
            if (max<times[i]){
                max = times[i];
                t = (char)( i+'a');
            }
        }
        System.out.println(t);
        System.out.println(max);
    }
}
