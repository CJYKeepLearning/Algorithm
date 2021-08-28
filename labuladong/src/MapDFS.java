import java.util.LinkedList;

public class MapDFS {
    public int solve(){
        LinkedList list = new LinkedList();
        int start=1;
        int end=4;
        int[][] arr = {
                {0,0,0,0,0,0},
                {0,0,2,1,0,0},
                {0,0,0,0,5,4},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0},
                {0,0,0,0,0,0}
        };
        dfs(start,end,arr,list,0);
        return dis;
    }

    public LinkedList track;
    static int dis;
    public void dfs(int start,int end,int[][] arr,LinkedList track,int dis){
        if(start==end){
            this.track = track;
            this.dis  = dis;
            return;
        }
        for (int i=1;i<arr.length;i++){
            if (arr[start][i]==0 || track.contains(i))
                continue;
            track.add(i);
            dfs(i,end,arr,track,dis+arr[start][i]);
            track.removeLast();
        }
    }
}
