public class Bellman {
    int n;
    int m;
    //每次对所有每边遍历一次，进行松弛。意义：加入这条边能否，能否使得 1号顶点到v[i](即边的终点)得距离变小。
    //对于第i条边，u[i]记录起点，v[i]记录终点,w[i]记录从u[i]点到v[i]点的权重
    //对于n个顶点，任意两点之间的最短路径最多包含n-1个路径，所以只需要松弛n-1此。k控制循环次数
    void bellman(){
        int[] dis = new int[n+1];
        int[] u = new int[m+1];
        int[] v = new int[m+1];
        int[] w = new int[m+1];
        for (int k=1;k<=n-1;k++){
            for (int i=1;i<=m;i++){
                if(dis[v[i]]>dis[u[i]]+w[i]){
                    dis[v[i]] = dis[u[i]]+w[i];
                }
            }
        }
    }
}
