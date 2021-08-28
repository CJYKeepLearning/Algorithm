import java.util.HashSet;

public class PREV_9 {
    public static void main(String[] args) {
        int n=5;
        int[][] arr = {
                {0,0,0,0,0,0},
                {0,0,2,1,0,0},
                {0,2,0,0,5,4},
                {0,1,0,0,0,0},
                {0,0,5,0,0,0},
                {0,0,4,0,0,0}
        };
/*        int ans = dfs(n,arr);
        System.out.println(ans);*/
        int temp = cost(1,4,arr,0,new HashSet());
        System.out.println(temp);
    }
    static int totalDis;
    public static int dfs(int n,int[][] arr){
        int res = Integer.MIN_VALUE;
        for (int i=1;i<=n;i++){
            for (int j=i+1;j<=n;j++){
                HashSet vis = new HashSet();
                cost(i,j,arr,0,vis);
                res = Math.max(res,totalDis);
            }
        }
        return res;
    }
    static int ans;
    public static int cost(int a, int b, int[][] arr, int dis,HashSet vis){
        if (arr[a][b]!=0){
            return arr[a][b];
        }
        if (a==b){
            return dis;
        }
        for (int i=1;i<arr.length;i++){
            if (!vis.contains(i) && arr[a][i]!=0){
                vis.add(i);
                ans = cost(i,b,arr,dis+arr[a][i],vis) +arr[a][i];
                vis.remove(i);
            }
        }
        return ans;
    }
}
