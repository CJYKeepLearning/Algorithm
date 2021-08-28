import java.lang.reflect.Array;
import java.util.Arrays;

public class dpMinSum {
    //求两个字符串的最小ASCII删除和
    public static int memo[][];
    public static int minimunDeleteSum(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        memo = new int[m][n];
        for (int[] me:memo){
            Arrays.fill(me,-1);
        }
        int ans = dp(s1,0,s2,0);
        return ans;
    }
    public static int dp(String s1,int i,String s2,int j){
        int res = 0;
        if (i==s1.length()){
            for (;j<s2.length();j++)
                res += s2.charAt(j);
        }
        if (j==s2.length()){
            for (;i<s1.length();i++)
                res += s1.charAt(i);
        }
        if (memo[i][j]!=-1)
            return memo[i][j];
        if (s1.charAt(i) == s2.charAt(j)){
            memo[i][j] = dp(s1,i+1,s2,j+1);
        }else {
            memo[i][j] = Math.min(dp(s1,i+1,s2,j),dp(s1,i,s2,j+1));
        }
        return memo[i][j];
    }
}
