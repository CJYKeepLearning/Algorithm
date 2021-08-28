import sun.applet.resources.MsgAppletViewer_ja;

public class dpBianJiJuLi {
    //编辑距离
    public static void main(String[] args) {
        String s1 = "rad";
        String s2 = "apple";
        System.out.println(minDistance(s1,s2));
    }
    /*
          //备忘录
    public static int minDistance(String s1,String s2){
        int i = s1.length()-1;
        int j = s2.length()-1;
        int[][] memo = new int[i+1][j+1];
        for (int m=0;m<memo.length;m++){
            for (int n=0;n<memo[0].length;n++)
                memo[m][n] = Integer.MAX_VALUE;
        }
        //return dpDis(s1,i,s2,j,memo);
        return dpDis(s1,i,s2,j);
    }
        public static int dpDis(String s1,int i,String s2,int j,int[][] memo){
        if (i==-1) return j+1;
        if (j==-1) return i+1;
        if (memo[i][j]!=Integer.MAX_VALUE)
            return memo[i][j];

        if (s1.charAt(i) == s2.charAt(j)){
            memo[i][j] = dpDis(s1,i-1,s2,j-1,memo);
        }else {
            int insert = dpDis(s1,i,s2,j-1,memo);
            int del = dpDis(s1,i-1,s2,j,memo);
            int rep = dpDis(s1,i-1,s2,j-1,memo);
            memo[i][j] =  Math.min(insert,Math.min(del,rep));
        }
        return memo[i][j];
    }*/
    //DPtable
    public static int minDistance(String s1,String s2){
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        for (int i=0;i<=n;i++)
            dp[0][i] = i;
        for (int i=0;i<=m;i++)
            dp[i][0] = i;
        int i=0,j=0;
        for (i=1;i<=m;i++){
            for (j=1;j<=n;j++){
                if (s1.charAt(i-1)==s2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else {
                    int a = dp[i][j-1]+1;
                    int b = dp[i-1][j]+1;
                    int c = dp[i-1][j-1]+1;
                    dp[i][j] = Math.min(a,Math.min(b,c));
                }
            }
        }
        return dp[i-1][j-1];
    }
}
