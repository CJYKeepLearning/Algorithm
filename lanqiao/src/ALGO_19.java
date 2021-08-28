import java.util.Scanner;

public class ALGO_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N+1][N+1];
        int[][] dp = new int[N+1][N+1];
        for (int i=1;i<=N;i++){
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            arr[m][n] = scanner.nextInt();
        }
        for (int i=1;i<=N;i++){
            dp[i][1] = arr[i][1];
            dp[1][i] = dp[1][i];
        }
        for (int i=2;i<=N;i++){
            for (int j=2;j<=N;j++){
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+arr[i][j];
            }
        }
        System.out.println(dp[N][N]);
        for (int i=1;i<=N;i++){
            for (int j=1;j<=N;j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
    }

}
