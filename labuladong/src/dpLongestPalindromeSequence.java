import java.lang.reflect.Array;
import java.util.Arrays;

public class dpLongestPalindromeSequence {
    //最长回文子序列
    public static int longestPalindromeSubseq(String s){
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int[] d:dp)
            Arrays.fill(d,1);
        //因为求d[i][j]时，用dp[i+1][j]/dp[i][j-1]/dp[i+1,j-1]，所以需要保证这三个先求出来
        // 所以反着遍历，先最后一层，因为下三角初始化已经填满了，再倒数第二层。。。
        for (int i=n-1;i>=0;i--){
            for (int j=i+1;j<n;j++){
                if (s.charAt(i) == s.charAt(j))
                    dp[i][j] = dp[i+1][j-1]+2;
                else
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
            }
        }
        return dp[0][n-1];
    }
}
