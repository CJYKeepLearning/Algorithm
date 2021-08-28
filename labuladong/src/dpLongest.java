import java.util.ArrayList;
import java.util.Arrays;

public class dpLongest {
/*    备忘录写法
        public static void main(String[] args) {
        int[] num = {10,9,2,5,3,7,101,18};
        int[] memo = new int[num.length];
        for (int i=0;i<memo.length;i++)
            memo[i] = Integer.MAX_VALUE;
        memo[0] = 1;
        System.out.println(longSque(num,num.length-1,memo));
    }
    public static int longSque(int[] num,int right,int[] memo){
        if (memo[right]!=Integer.MAX_VALUE)
            return memo[right];
        //包括最后一个
        int a,count1=1;
        int max = num[right];
        for (a=right;a>=0;a--){
            if (num[a]<max){
                count1++;
                max = num[a];
            }
        }
        //不包括最后一个
        int count2 = longSque(num,right-1,memo);
        memo[right] =  Math.max(count1,count2);
        return memo[right];
    }*/

    public static void main(String[] args) {
        int[] num = {10,9,2,5,3,7,101,18};
        int dis = dpLonSque(num);
        System.out.println(dis);
    }
/*        //DPTable--   Myself
public static int dpLonSque(int[] num){
        int[] dp = new int[num.length];
        dp[0] = 1;
        for (int i=1;i<num.length;i++){

            int a,count1=1;
            int max = num[i];
            for (a=i;a>=0;a--){
                if (num[a]<max){
                    count1++;
                    max = num[a];
                }
            }
            int count2 = dp[i-1];
            dp[i] = Math.max(count1,count2);
        }
        return dp[num.length-1];
    }*/
    //labuladong
    public static int dpLonSque(int[] num){
        int[] dp = new int[num.length];
        Arrays.fill(dp,1);
        for (int i=0;i<num.length;i++){
            for (int j=0;j<i;j++){
                if (num[j]<num[i])
                    dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        int res = 0;
        for (int i=0;i<dp.length;i++)
            res = Math.max(res,dp[i]);
        return res;
    }
}
