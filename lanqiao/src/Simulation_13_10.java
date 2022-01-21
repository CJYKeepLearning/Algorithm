import java.util.Scanner;

public class Simulation_13_10 {
    static int n,m;
    static char[][] s = new char[310][310];
    static boolean[][] st = new boolean[310][310];
    static int ans = 90000;
    static int[] dx = {1,0,-1,0};
    static int[] dy = {0,1,0,-1};
    static void dfs(int i,int j,int count){
        if (i==n-1 && j==m-1){
            ans = Math.min(ans,count);
            return;
        }
        st[i][j] = true;
        for (int k = 0; k < 4; k ++){
            int x = i + dx[k], y = j + dy[k];

            if (x < 0 || x >= n || y < 0 || y >= m) continue;
            if (st[x][y]) continue;
            if (s[i][j] == '2' && s[x][y] == '2') continue;

            if (s[x][y] == '2') dfs(x, y, count + 1);
            else dfs(x, y, count);
        }

        st[i][j] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i=0;i<n;i++){
            String t = sc.next();
            s[i] = t.toCharArray();
        }
        dfs(0,0,0);
        if (ans==90000)
            System.out.println("-1");
        else
            System.out.println(ans);
    }
}
