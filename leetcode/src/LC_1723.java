import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LC_1723 {
    public static void main(String[] args) {
        int[] jobs = {5,5,4,4,4};
        int k = 2;
        int res = minimumTimeRequired(jobs,k);
        System.out.println(res);
    }
/*    public static int minimumTimeRequired(int[] jobs, int k) {
        //dp数组:dp[i][j]在i项工作，j人时，最小的工作时间。
        int[][] dp = new int[jobs.length][k];
        for (int i=0;i<dp.length;i++){
            for (int j=0;j<dp[0].length;j++){
                dp[i][j] = Math.min(dp[i-1],)+jobs[];
            }
        }
        return 0;
    }*/
    public static int[] memo;
    public static int minimumTimeRequired(int[] jobs, int k) {
        Arrays.sort(jobs);
        //dp数组:dp[i][j]在i项工作，j人时，最小的工作时间。
        memo = new int[k];
        for (int i = jobs.length-1; i>=0; i--) {
            f(jobs[i]);
        }
        int max = Integer.MIN_VALUE;
        for (int t:memo
             ) {
            if (max<t)
                max = t;
        }
        return max;
    }
    //f方法，将工作i放到memo中代表工人的时间。
    public static void f(int t){

        int min = Integer.MAX_VALUE;
        int index=0;
        for (int i=0;i<memo.length;i++){
         if (min>memo[i]) {
             min = memo[i];
             index = i;
         }
        }
        memo[index] += t;
    }
}
