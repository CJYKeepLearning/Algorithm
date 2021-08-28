import com.sun.imageio.plugins.common.I18N;

import java.util.*;

public class Test {
    public static void main(String[] args) {
/*        target = 3;
        int arr[] = {1,1,1,1,1};
        dp(arr,0,target);
        dfs(0,arr,0);
        System.out.println(total);*/
    }
    //分割等和子集starting
    boolean canPartition(int[] nums){
        int sum=0;
        for (int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        //给一个可装载重量为sum/2的背包和N个物品，每个物品的重量为nums[i]。
        //现在让你装物品，是否存在一种装法，能够恰好将背包装满。

        boolean[][] dp = new boolean[nums.length+1][sum+1];
        for (int i=0;i<dp.length;i++)
            Arrays.fill(dp[i],false);

        //状态转移方程：
        //dp[i][j] = dp[i-1][j-nums[i]] || dp[i-1][j]
        //base case
        for (int i=0;i<=nums.length;i++)
            dp[i][0] = true;

        for (int i=1;i<dp.length;i++){
            for (int j=1;j<=sum;j++)
                if (j-nums[i-1]<0)
                    dp[i][j] = dp[i-1][j];
                else
                 dp[i][j] = dp[i-1][j] || dp[i-1][j-nums[i-1]];
        }

        return dp[nums.length][sum];
    }
    //分割等和子集ending

    //dfs start
    static int target;
    static int total=0;
    static void dfs(int sum, int[] arr,int len){
        if(sum==target && len ==arr.length)
            total++;
        if (len==arr.length)
            return;
        sum += arr[len];
        dfs(sum,arr,len+1);
        sum -= arr[len];

        sum -= arr[len];
        dfs(sum,arr,len+1);
        sum += arr[len];
    }
    //dfs end

    //dp start
    static HashMap<String,Integer> memo = new HashMap<>();
    static int dp(int[] arr,int i,int rest){
        if (i==arr.length){
            if (rest==0)
                total++;
            return 0;
        }
        String key = i+","+rest;
        if (memo.containsKey(key)){
            return memo.get(key);
        }
        int result = dp(arr,i+1,rest - arr[i])+dp(arr,i+1,rest+arr[i]);
        memo.put(key,rest);
        return result;
    }
    //dp end

    //subsets start
    int subsets(int[] nums,int sum){
        int n = nums.length;
        int[][] dp = new int[n+1][sum+1];
        //base case
        for (int i=0;i<=n;i++)
            dp[i][0] = 1;
        //dp二维
        for (int i=1;i<=n;i++){
            for (int j=1;j<=sum;j++){
                if (j-nums[i]<0){
                    dp[i][j] = dp[i-1][j];
                }else {
                    dp[i][j] = dp[i-1][j]+dp[i-1][j-nums[i-1]];
                }
            }
        }
        //dp压缩成一维
/*        for (int i=1;i<=n;i++){
            for (int j=sum;j>=0;j--){
                if (j>=nums[i-1]){
                    dp[j] =dp[j] + dp[j-nums[i]];
                }else {
                    dp[j] = dp[j];
                }
            }
        }*/
        return dp[n][sum];
    }
    //subsets end

    //floyd start
    //k在最外层，确定一个k，然后遍历一次数组。确定一个k，遍历一次数组
    void floyd(){
        int m=5;
        int[][] nums = new int[m][m];

        for (int k=0;k<m;k++){
            for (int i=1;i<=m;i++){
                for (int j=0;j<m;j++){
                    if (nums[i][j]>nums[i][k]+nums[k][j]){
                        nums[i][j] = nums[i][k]+nums[k][j];
                    }
                }
            }
        }
    }
    //floyd end

    //Dijskra start
    //指定一个点到其余各个顶点的最短路径。
    void Dijstra(){
        int n=5;
        int source = 1;
        int[][] e = new int[n][n];
        int[] dis = new int[n];
        int[] rcd = new int[n];
        for (int i=0;i<dis.length;i++){
            dis[i] = e[source][i];
        }
        Arrays.fill(rcd,0);
        rcd[source] = 1;
        for (int k=0;k<dis.length;k++){
            int min = Integer.MAX_VALUE;
            int idx=0;
            for (int i=0;i<dis.length;i++){
                if (min>dis[i] && rcd[i] == 0){
                    min = dis[i];
                    idx = i;
                }
            }
            rcd[idx] = 1;
            for (int j=0;j<dis.length;j++){
                if (e[k][j]<Integer.MAX_VALUE){
                    if (dis[j]>dis[k]+e[k][j]){
                        dis[j] = dis[k]+e[k][j];
                    }
                }
            }

        }
    }
    //Dijskra end

    //bellman ford start
    //解决负权边
    void bellman(){
        int n=4;    //n为顶点数
        int m = 3;  //m为边数
        int source=1;
        int[][] e = new int[n][n];
        int[] u = new int[n];
        int[] v = new int[n];
        int[] w = new int[n];
        int[] dis = new int[n];
        for (int i=0;i<dis.length;i++){
            dis[i] = e[source][i];
        }

        for (int k=1;k<=n;k++){
            int[] bak = dis.clone();
            for (int i=1;i<=m;i++){
                if (dis[v[i]] > dis[u[i]] + w[i]) {
                    dis[v[i]] = dis[u[i]] + w[i];
                }
            }
            int check=0;
            for (int i=0;i<=n;i++){
                if (bak[i]!=dis[i]){
                    check = 1;break;
                }
            }
            if (check == 0)
                break;
        }
        //检测负权回路：
        //如果有负权，那么dis[v[i]] > dis[u[i]] + w[i]。（因为负的会继续王下减)
        int flag = 0;
        for (int i=1;i<=m;i++){
            if (dis[v[i]] > dis[u[i]] + w[i]) {
                flag = 1;
                break;
            }
        }
        if (flag==1){
            System.out.println("包含负权回路");
        }
    }
    //bellman ford start

    //bellman ford start 优化
    void bellmanYH(){
        int n = 5;  //顶点个数
        int source = 1;
        int[][] e = new int[n][n];
        int[] u = new int[n];
        int[] v = new int[n];
        int[] w = new int[n];
        int[] dis = new int[n];
        //初始化dis数组
        for (int i=0;i<dis.length;i++){
            dis[i] = e[source][i];
        }
        Queue<Integer> q = new LinkedList();
        Set vis = new HashSet();

        q.offer(source);
        while (!q.isEmpty()){
            int cur = q.poll();
            for (int i=0;i<e.length;i++){
                if (!vis.contains(i) && dis[i]>e[cur][i]+dis[cur]){
                    dis[i] = e[cur][i]+dis[cur];
                }
            }
        }

    }


}
