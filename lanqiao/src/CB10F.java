import java.util.Scanner;

public class CB10F {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        int[][] dp = new int[1001][1001];
        s = sc.next();
        t = sc.next();
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        for (int i=1;i<=cs.length;i++){
            for (int j=1;j<=ct.length;j++){
                if (cs[i-1] == ct[j-1]){
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]);
                }else{
                    dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]+1);
                }
            }
        }
    }
}
