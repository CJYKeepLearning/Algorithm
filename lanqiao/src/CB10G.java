import java.util.Scanner;

public class CB10G {
    public static void main(String[] args) {
        int[][] dp = new int[505][505];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i=1;i<=n;i++) dp[i][1] = 2;
        for (int i=3;i<=n;i++){
            for (int j=2;j<=i-1;j++){
                dp[i][j] = (dp[i-1][j-1]*2+dp[i-1][j]*j+dp[i-1][j-2]*(i-j));
                dp[i][j] %= 123456;
            }
        }
        System.out.println(dp[n][k]);
    }
}
