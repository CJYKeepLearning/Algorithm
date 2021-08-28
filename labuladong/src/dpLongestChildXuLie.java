import sun.nio.cs.ext.MacArabic;

import java.lang.reflect.Array;
import java.util.Arrays;

public class dpLongestChildXuLie {
    //最长公共子序列
    //比如说输入s1 = "zabcde", s2 = "acez"，它俩的最长公共子序列是lcs = "ace"，长度为 3，所以算法返回 3。
    public static void main(String[] args) {
        String s1 = "zabcde", s2 = "acez";
        int ans1 = solution1(s1,s2);
        int ans2 = solution2(s1,s2);
        int ans3 = solution3(s1,s2);
        System.out.println(ans3);
    }
    public static int[][] memo;
    //从前往后
    public static int solution1(String s1,String s2){
        memo = new int[s1.length()][s2.length()];
        for (int[] m:memo)
            Arrays.fill(m,-1);
        int ans = helper1(s1,0,s2,0);
        return ans;
    }
    public static int helper1(String s1,int i,String s2,int j){
        if (s1.length()==i||s2.length()==j) return 0;
        if (memo[i][j]!=-1)
            return memo[i][j];
        if (s1.charAt(i)==s2.charAt(j))
            memo[i][j] = 1+helper1(s1,i+1,s2,j+1);
        else
            memo[i][j] = Math.max(helper1(s1,i+1,s2,j),helper1(s1,i,s2,j+1));
        return memo[i][j];
    }
    //从后往前
    public static int solution2(String s1,String s2){
        memo = new int[s1.length()][s2.length()];
        for (int[] m:memo)
            Arrays.fill(m,-1);
        int ans=helper2(s1,s1.length()-1,s2,s2.length()-1);
        return ans;
    }
    public static int helper2(String s1,int i,String s2,int j){
        if (i==-1||j==-1) return 0;
        if (memo[i][j]!=-1)
            return memo[i][j];
        if (s1.charAt(i)==s2.charAt(j))
            memo[i][j] = 1+helper2(s1,i-1,s2,j-1);
        else
            memo[i][j] = Math.max(helper2(s1,i-1,s2,j),helper2(s1,i,s2,j-1));
        return memo[i][j];
    }
    public static int solution3(String s1,String s2){
        if (s1.length()==0||s2.length()==0) return 0;

        int[][] dp = new int[s2.length()][s1.length()];
        int cnt = 0;
        for (int i=0;i<s1.length();i++){
            if (s2.charAt(0)==s1.charAt(i))
                dp[0][i] = ++cnt;
            else
                dp[0][i] = cnt;
        }
        for (int j=0;j<s2.length();j++){
            if (s1.charAt(0)==s2.charAt(j))
                dp[j][0] = 1;
        }
        for (int i=1;i<s2.length();i++){
            for (int j=1;j<s1.length();j++){
                if (s2.charAt(i)==s1.charAt(j))
                    dp[i][j] = 1+dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[s2.length()-1][s1.length()-1];
    }
}
