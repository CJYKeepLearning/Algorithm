import java.util.Scanner;

public class ALGO_36 {
    public static int[][] arr = new int[52][52];
    public static int[][][][] re = new int[52][52][52][52];
    public static int max(int a,int b,int c,int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int x1=1;x1<=m;x1++){
            for (int y1=1;y1<=n;y1++){
                arr[x1][y1] = scanner.nextInt();
            }
        }
        int t,t2;
        for (int i = 1; i <= m; ++i)
        {
            for (int j = 1; j <= n; ++j)
            {
                for (int k = 1; k <= m; ++k)
                {
                    for (int l = 1; l <= n; ++l)
                    {
                        t = Math.max(re[i][j - 1][k - 1][l],re[i - 1][j][k][l - 1]);
                        t2 = Math.max(re[i - 1][j][k - 1][l],re[i][j - 1][k][l - 1]);
                        re[i][j][k][l] = Math.max(t,t2) + arr[i][j] + arr[k][l];
                        if (i == k && j == l)
                            re[i][j][k][l] -= arr[i][j];
                    }
                }
            }
        }
        System.out.println(re[m][n][m][n]);
    }

}
