public class dpSubsequenceTemplate {
    //One-dimensional Array
    public static void OneDimensionalArray(int[] array){
        int n = array.length;
        int[] dp = new int[n];

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
//               关键语句：状态转移方程
//               dp[i] = 最值(dp[i], dp[j] +...);
            }
        }
    }
    //Two-dimensional Array
    public static void TwoDimensionalArray(int[] array){
        int n = array.length;
        int[][] dp = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j=1;j<n;j++){
//                if (array[i]==array[j])
//                    dp[i][j] = dp[i][j]+...
//             else
//                    dp[i][j] = 最值(...)
            }
        }
    }

}
