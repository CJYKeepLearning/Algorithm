import java.util.HashSet;
import java.util.Scanner;

public class ALGO_统计单词个数 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int k = scanner.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i=1;i<=p;i++){
            String st = scanner.next();
            sb.append(st);
        }
        //将字符串连接起来
        String string = sb.toString();
        //得到字典
        int s = scanner.nextInt();
        //用HaashSet记录字典
        HashSet<String> dic = new HashSet();
        for (int i=1;i<=s;i++){
            dic.add(scanner.next());
        }
        int[][] dp = new int[string.length()][k+1];
        for (int i=0;i<string.length();i++){
            for (int j=1;j<=k;j++){
                for(int q=i;q>=j-1;q--)
                {
                    int t = dic.contains(string.substring(q,j))==true?1:0;
                    dp[i][j] = Math.max(dp[q-1][j-1]+t,dp[i][j]);
                }
                }
            }
        }
}
