import java.util.Scanner;

public class ALGO_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int V = scanner.nextInt();
        int n = scanner.nextInt();
        int[] w = new int[n+1];
        int[][] dp = new int[n+1][V+1];
        for (int i=1;i<w.length;i++){
            w[i] = scanner.nextInt();
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=V;j++){
                if (j<w[i])
                    dp[i][j] = dp[i-1][j];
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-w[i]]+w[i]);
                }
            }
        }
        System.out.println(V-dp[n][V]);
    }
}
