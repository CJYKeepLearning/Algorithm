import java.util.Scanner;

public class ALGO_35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //dp[i][j] i个人时，传递j次有多少种方法
        //base case

        int[][] dp = new int[n+1][m+1];
        dp[2][1] = 1;
        dp[n][1] = 1;
        for (int i=2;i<=m;i++){
            for (int j=1;j<=n;j++){
                if (j==1)
                    dp[j][i] = dp[n][i-1]+dp[j+1][i-1];
                else if (j==n)
                    dp[j][i] = dp[j-1][i-1] + dp[1][i-1];
                else
                    dp[j][i] = dp[j-1][i-1]+dp[j+1][i-1];
            }
        }
        System.out.println(dp[n][m]);

    }
}
