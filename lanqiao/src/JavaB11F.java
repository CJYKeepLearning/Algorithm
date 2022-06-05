import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaB11F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();

        String[] sA = new String[1000];
        int cnt1 = 0;
        int b1 = 0;
        for(int i=1;i<A.length();i++) {
            char now = A.charAt(i);
            if(now>='A'&&now<='Z') {
                sA[cnt1++]=A.substring(b1,i);
                b1 = i;
            }
        }
        sA[cnt1++] = A.substring(b1);


        String[] sB = new String[1000];
        int cnt2 = 0;
        int b2 = 0;
        for(int i=1;i<B.length();i++) {
            char now = B.charAt(i);
            if(now>='A'&&now<='Z') {
                sB[cnt2++]=B.substring(b2,i);
                b2 = i;
            }
        }
        sB[cnt2++] = B.substring(b2);

        int[][] dp = new int[cnt1+1][cnt2+1];

        for(int i=1;i<=cnt1;i++) {
            for(int j=1;j<=cnt2;j++) {
                if(sA[i-1].equals(sB[j-1])) dp[i][j]=dp[i-1][j-1]+1;
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        System.out.println(dp[cnt1][cnt2]);
    }

}
