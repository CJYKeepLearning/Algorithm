import java.util.ArrayList;
import java.util.LinkedList;

public class Test {
    static Integer[] arr;
    public static void main(String[] args) {
        //LIS("10,9,2,5");
    }
    //编辑距离
    /*
    字符串问题的套路都差不多
    i,j指向两个字符串的末尾，代表1...i,1...j.定义一个dp属数组，写出转移方程
    * */
    static void LIS(int[] num){
        int s1len = num.length;
        //转移方程
        //dp[i]:1...i中最长递增子序列的值
        int[] dp = new int[s1len+1];
        int max = Integer.MIN_VALUE;
        //base case
        dp[0] = 1;
        //dp转移
        for (int i=1;i<=s1len;i++){
            for (int k=0;k<i;k++)
            {
                if (num[k]<num[i]){
                    max = Math.max(max,dp[k]+1);
                }else {
                    max = Math.max(max,dp[k]);
                }
            }
            dp[i] = max;
        }
        System.out.println(dp[s1len]);;
    }
    static void LCS(String s1,String s2){
        //dp[i][j] = x ; s1中前i个，s2中前j个。的最长公共子序列为x;
     int[][] dp = new int[s1.length()+1][s2.length()+1];
     for (int i=1;i<=s1.length();i++){
         for (int j=1;j<=s2.length();j++){
             if (s1.charAt(i-1)==s2.charAt(j-1)){
                 dp[i][j] = dp[i-1][j-1]+1;
             }else {
                 dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
             }
         }
     }
        System.out.println(dp[s1.length()][s2.length()]);
    }
    static void Dis(String s1,String s2){
        int[][] dp = new int[s1.length()+1][s2.length()+1];
        //base case
        for (int i=1;i<=s1.length();i++)
            dp[i][0] = i;
        for (int i=1;i<=s2.length();i++)
            dp[0][i] = i;
        //dp
        for (int i=1;i<=s1.length();i--){
            for (int j=1;j<=s2.length();j--){
                if (s1.charAt(i)!=s2.charAt(j)){
                    dp[i][j]  = Math.max(dp[i-1][j-1],Math.max(dp[i-1][j],dp[i][j-1]))+1;
                }else {
                    dp[i][j] = dp[i-1][j-1];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
    static void solveF(){
        //dp[i][j] = x:   S中前i个 至少改动x个能包含 T中前j个
        //base case:
        //dp[i][0] = 0;
        //dp[0][j] = INF
        String s = "ABCDEABCD";
        String t = "XAABZ";
        int[][] dp = new int[s.length()][t.length()];
        for (int i=0;i<s.length();i++){
            for (int j=0;j<t.length();j++){
                int d = s.charAt(i) == t.charAt(j)?0:1;
                dp[i][j] = Math.min(dp[i-1][j],dp[i-1][j-1]+d);
            }
        }
    }


    //
    static int[] x = {0,1,0,-1};
    static int[] y = {-1,0,1,0};
    static int res = 0;
    static void solveE(LinkedList<String> track,int dep,int i,int j){
        if (track.size()!=0 && track.getLast().equals("00") && dep<=12 ){
            res++;
        }
        if (dep>12){
            return;
        }
        for (int k=0;k<x.length;k++){
            int xx = i+x[k];
            int yy = j+y[k];
            String s = String.valueOf(xx)+String.valueOf(yy);
            if (!track.contains(s) || s.equals("00")){
                if (xx>=0 && xx<=7 && yy>=0 && yy<=7){
                    track.add(s);
                    solveE(track,dep+1,xx,yy);
                    track.removeLast();
                }
            }
        }
    }
    //
    static void solveC(){

    }
    static void solveD(){
        int i=1;
        while (solveDHELP(i)!=100){
            i++;
        }
        System.out.println(i);
    }
    static int solveDHELP(int n){
        int ans = 0;
        int i=1;
        for (i=1;i*i<n;i++){
            if (n%i==0){
                ans += 2;
            }
        }
        if (i*i==n)
            ans+=1;
        return ans;
    }
    static void solveB(){
        ArrayList nums = new ArrayList();
        for (int i=2;i<=2017;i++){
            if (isPrime(i))
                nums.add(i);
        }
        arr = new Integer[nums.size()];
        nums.toArray(arr);
        long[] dp = new long[2020];
        dp[0] = 1;
        for (int i=0;i<arr.length;i++){
            for (int j=2019;j>=0;j--){
                if (j-arr[i]<0)
                    continue;
                dp[j] += dp[j-arr[i]];
            }
        }
        System.out.println(dp[2019]);
    }
    static boolean isPrime(int a){
        int k =(int) Math.sqrt(a);
        for (int i=2;i<=k;i++){
            if (a%i==0)
                return false;
        }
        return true;
    }
    static void solveA1(){
        int q = 1;
        boolean flag = true;
        while (flag){
            int x2 = 2019*2019+q;
            int y2 = x2+q;
            if (AisOK(x2) && AisOK(y2)){
                System.out.println(Math.sqrt(x2)+Math.sqrt(y2));
                flag = false;
            }else {
                q++;
            }
        }
    }
    static void solveA2(){
        for(int x=2020; ;x++)
            for (int y = 2021; y < 10000; y++)
                if ((x * x - 2019 * 2019) ==
                        ((y*y) - x* x))
                {
                    System.out.println(x+y);
                }
    }
    static boolean AisOK(int a){
        int i =(int) Math.sqrt(a);
        if (i*i==a)
            return true;
        else
            return false;
    }
}
