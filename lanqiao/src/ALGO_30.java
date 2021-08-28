import java.util.Scanner;

public class ALGO_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] vt = new int[M][2];//tv[i][0],采第i个所需时间，[i][1]其价值
        for (int i=0;i<M;i++){
            vt[i][1] = scanner.nextInt();//时间耗费
            vt[i][0] = scanner.nextInt();//价值
        }
        int[][] dp = new int[M+1][T+1];
        //base case
        for (int i=1;i<=M;i++){
            for (int j=1;j<=T;j++){
                if (j<vt[i-1][1]){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-vt[i-1][1]]+vt[i-1][0]);
                }
            }
        }
        System.out.println(dp[M][T]);
    }
}
