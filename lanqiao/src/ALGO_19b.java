import sun.security.mscapi.CPublicKey;

import java.util.Scanner;

public class ALGO_19b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N + 1][N + 1];
        int[][] dp = new int[N + 1][N + 1];
        int m,n;
        do {
            m = scanner.nextInt();
            n = scanner.nextInt();
            arr[m][n] = scanner.nextInt();
        }while (m!=0 && n!=0);

        int[][][][] f = new int[N+1][N+1][N+1][N+1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                for (int h = 1; h <= N; h++) {
                    for (int k = 1; k <= N; k++) {
                        int tmp1 = Math.max(f[i - 1][j][h - 1][k], f[i][j - 1][h][k - 1]);//上上、左左两个方向
                        int tmp2 = Math.max(f[i][j - 1][h - 1][k], f[i - 1][j][h][k - 1]);//左上、上左两个方向
                        f[i][j][h][k] = Math.max(tmp1, tmp2) + arr[i][j];
                        if (i != h && j != k)
                            f[i][j][h][k] += arr[h][k];
                    }
                }
            }
        }
        System.out.println(f[N][N][N][N]);
    }
    public static int maxValue(int[][] arr,int m,int n){
//base case
        int[][] dp = new int[m+1][n+1];
        for (int i=1;i<=m;i++){
            dp[i][1] = arr[i][1];
        }
        for (int i=1;i<=n;i++){
            dp[1][i] = arr[1][i];
        }
        //dp转移
        for (int i=2;i<=m;i++){
            for (int j=2;j<=n;j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+arr[i][j];
            }
        }
        return dp[m][n];
    }

}


/*
*         //base case
        for (int i=1;i<=N;i++){

            dp[i][1] = arr[i][1];
            dp[1][i] = arr[1][i];

        }
        //dp转移
        for (int i=2;i<=N;i++){
            for (int j=2;j<=N;j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+arr[i][j];
            }
        }*/
