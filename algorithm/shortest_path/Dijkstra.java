import java.util.HashSet;
import java.util.Scanner;
//求解单源点到其他点的最短距离
//在dis数组中找离源点最近的顶点，标志访问，根据此点松弛一遍源点到其余顶点的距离。
public class Dijkstra {
    //dijkstra
    /*
    6 9
    1 2 1
    1 3 12
    2 3 9
    2 4 3
    3 5 5
    4 3 4
    4 5 13
    4 6 15
    5 6 4
     */
    int[][] e;
    int n;
    int m;
    void solve(){
        int inf = 9999999;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        e = new int[n+1][m+1];
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                if (i==j) e[i][j]=0;
                else e[i][j] = inf;
            }
        }
        //读入边
        for (int i=1;i<=m;i++){
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();
            int t3 = sc.nextInt();
            e[t1][t2] = t3;
        }
        DijkstraSolve();
    }
    void DijkstraSolve(){
        //dis记录源点到其余顶点距离
        int[] dis = e[1].clone();
        HashSet<Integer> vis = new HashSet<Integer>();
        vis.add(1);
        //算法核心
        for (int j=1;j<=n-1;j++){
            int min = Integer.MAX_VALUE;
            int idx=0;
            for (int i=1;i<=n;i++){
                if (min>dis[i] && !vis.contains(i)){
                    min = dis[i];
                    idx = i;
                }
            }
            vis.add(idx);

            for (int i=1;i<=n;i++){
                if (dis[i]>e[1][idx]+e[idx][i])
                    dis[i] = e[1][idx]+e[idx][i];
            }
        }

        for (int i=1;i<=n;i++){
            System.out.print(" "+dis[i]+" ");
        }

    }
}
