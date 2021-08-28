import java.util.Scanner;

public class kgoodnum {
    public static void main(String[] args) {
        int MOD = 1000000007;
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();   //进制
        int l = sc.nextInt();   //
        int dp[][] = new int[l+1][k];

        int sum = 0;
        for (int i = 0;i<k;i++){
            dp[1][i] = 1;
        }
        for (int i = 2;i<=l;i++){
            for (int j =0;j<k;j++){
                for (int m =0;m<k;m++){
                    if(j!=m+1 && j!=m-1){
                        dp[i][j] += dp[i-1][m];
                        dp[i][j] %= MOD;
                    }
                }
            }
        }
        for (int i=1;i<k;i++){
            sum +=dp[l][i];
            sum%=MOD;
        }
        System.out.println(sum);
    }
}
