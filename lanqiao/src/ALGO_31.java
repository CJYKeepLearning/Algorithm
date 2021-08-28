import java.util.Scanner;

public class ALGO_31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int m = scanner.nextInt();
        int[] v = new int[m];
        int[] p = new int[m];
        for (int i=0;i<m;i++){
            v[i] = scanner.nextInt();
            p[i] = scanner.nextInt();
        }
        int[][] dp = new int[m+1][N+1];
        for (int i=1;i<=m;i++){
            for (int j=1;j<=N;j++){
                if (j<v[i-1])
                    dp[i][j] = dp[i-1][j];
                else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-v[i-1]]+v[i-1]*p[i-1]);
                }
            }
        }
        System.out.println(dp[m][N]);
    }
}

