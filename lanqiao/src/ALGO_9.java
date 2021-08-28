import java.util.Scanner;

public class ALGO_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println(solve(k));
    }
    public static int solve(int k){
        int[][] dp = new int[k+1][k+1];
        for (int i=2;i<=k;i++)
            dp[i][2] = i*(i-1);
        for (int i=2;i<=k;i++)
            dp[i][i] = 2;
        for (int i=2;i<=k;i++){
            for (int j=3;j<i;j++){
                dp[i][j] = dp[i-1][j-1]+dp[i-1][j];
            }
        }
        int res=0;
        for (int i=2;i<=k;i++)
            res += dp[k][i];
        return res;
    }
}
