import java.util.Scanner;

public class ALGO_22b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] dp = new int[n+1][k+1];
        //dp[i][j] ：整数i，分成j份，有dp[i][j]种方法
        //base case 整数i分为1份，只有一种分法
        for (int i=1;i<=n;i++){
            dp[i][1] = 1;
        }
        //dp转移
        for (int i=2;i<=n;i++){
            for (int j=1;j<=k;j++){
                dp[i][j] = dp[i-1][j]+(i>=j?dp[i-1][j-1]:0);
            }
        }
        System.out.println(dp[n][k]);
    }
}
