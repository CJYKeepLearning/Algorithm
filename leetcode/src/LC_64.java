public class LC_64 {
    int minPathSum(int[][] grid){
        // dp[i][j] 到达第i,j的最小路径和
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int t = grid[0][0];
        for (int i=1;i<m;i++){
            dp[i][0] = t+grid[i][0];
            t = dp[i][0];
        }
        t = grid[0][0];
        for (int j=1;j<n;j++){
            dp[0][j] = grid[0][j] + t;
            t = dp[0][j];
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                int num = grid[i][j];
                dp[i][j] = Math.min(dp[i-1][j],dp[i][j-1])+num;
            }
        }
        return dp[m-1][n-1];
    }
}
