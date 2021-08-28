import java.util.LinkedList;
import java.util.Scanner;

public class PREV_58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] arr = new int[N][N];
        for (int i=0;i<N;i++){
            for (int j=0;j<=i;j++)
                arr[i][j] = scanner.nextInt();
        }
        LinkedList track = new LinkedList();
        track.add(arr[0][0]);
        dfs(track,arr,0,0,0,0,arr[0][0]);
        int max=Integer.MIN_VALUE;
        for (int i:resSum
             ) {
            max = Math.max(i,max);
        }
        System.out.println(max);
    }
    static LinkedList<Integer> resSum = new LinkedList();
    static void dfs(LinkedList track, int[][]arr,int i,int j,int left,int right,int sum){
        if (track.size()==arr.length && Math.abs(left-right)<=1){
            resSum.add(sum);
        }
        if (2*(left+right)>1+arr.length)
            return;
        if (i+1<arr.length){
            //选择左边节点
            track.add(arr[i+1][j]);
            dfs(track,arr,i+1,j,left+1,right,sum+arr[i+1][j]);
            track.removeLast();
            //选择右边节点
            if (j<=i){
                track.add(arr[i+1][j+1]);
                dfs(track,arr,i+1,j+1,left,right+1,sum+arr[i+1][j+1]);
                track.removeLast();
            }
        }
    }
}
