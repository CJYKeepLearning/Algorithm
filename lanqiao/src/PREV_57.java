import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class PREV_57 {
    static void f(){
        System.out.println(1);
    }
    void ff(){
        f();
    }
/*  暴力
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        childString(s);
    }
    static int sum = 0;
    static void childString(String s){
        for (int i=0;i<s.length();i++){
            for (int j=i+1;j<=s.length();j++){
                String cur = s.substring(i,j);
                f(cur);
            }
        }
        System.out.println(sum);
    }
    static void f(String s){
        HashSet vis = new HashSet();
        for (int i=0;i<s.length();i++){
            vis.add(s.charAt(i));
        }
        sum += vis.size();
    }*/
/*    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sum=0;
        //dp[i][j]对于字符串s,下标从i-j字串分值和为x
        LinkedList vis = new LinkedList();
        for (int i=0;i<s.length();i++){
            vis.add(s.charAt(i));
            for (int j=i;j<s.length();j++){
                if (!vis.contains(s.charAt(j)))
                vis.add(s.charAt(j));
                sum += vis.size();
            }
            vis = new LinkedList();
        }
        System.out.println(sum);
    }*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        memo = new int[s.length()][s.length()];
        int res = dp(0,s.length()-1,s);
        System.out.println(res);
    }
    static int[][] memo;
    static int dp(int l,int r,String s){

        if (l>r)
            return 0;

        if (memo[l][r]!=0)
            return memo[l][r];

        int sum=0;
        LinkedList vis = new LinkedList();
        for (int j=l;j<s.length();j++){
            if (!vis.contains(s.charAt(j)))
                vis.add(s.charAt(j));
            sum += vis.size();
        }
        memo[l][r] = dp(l+1,r,s)+sum;

        return memo[l][r];
    }
}
