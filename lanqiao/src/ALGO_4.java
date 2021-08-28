import java.util.*;

public class ALGO_4 {
    static int Tree[][];
    static int dp[][];

    public static void BuildTree(int x, int y) {
        //由于输入的数据描述的是树上的一条边，没有指明父子关系，所以分情况
        //如果y是x的孩子
        int i = 0;
        while (Tree[x][i] != 0) //一直循环，直到Tree[x][i] = 0,也就是直到没有孩子为止
            i++;
        Tree[x][i] = y;
        //如果x是y的孩子
        int j = 0;
        while (Tree[y][j] != 0) //一直循环，直到Tree[y][j] = 0,也就是直到没有孩子为止
            j++;
        Tree[y][j] = x;
    }

    public static void dfs(int x, int x_father) {
        int x_son = Tree[x][0];
        for(int i=0;x_son!=0;i++){
            x_son = Tree[x][i];
            if (x_son != x_father) { //BuildTree时是无向的，此处if条件判断用来确定x_son是x的孩子
                dfs(x_son, x);
                //状态转移方程：
                dp[x][1] += dp[x_son][0];
                dp[x][0] += Math.max(dp[x_son][0], dp[x_son][1]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dp = new int[n+1][2];
        Tree = new int[n*2][n*2];
        for (int i = 1; i <= n; i++) {
            dp[i][1] = sc.nextInt(); //树的第一层为根节点
        }
        for (int i = 0; i < n - 1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            BuildTree(x, y);
        }
        dfs(1, 0);
        System.out.println(Math.max(dp[1][1], dp[1][0])); //dfs最终状态是：根节点取或不取的最大值
        sc.close();
    }
}