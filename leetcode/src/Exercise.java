import java.util.*;

public class  Exercise{
    static boolean[] vis;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        vis = new boolean[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        long ans = DFS(arr, 0);
        System.out.println(ans);
    }
    private static long DFS(int[] arr,int k){
        if (k == arr.length - 1){
            if (check(arr)){
                return 1;
            }
            return 0;
        }
        int res = 0;
        vis[k] = true;
        res += DFS(arr,k+1);
        return res;
    }
    private static boolean check(int[] arr){
        int len = arr.length;
        int p = 0;
        int q =1;
        while (q < len){
            if (vis[q-1]){
                if (!check_lianxu(arr,p,q)){
                    return false;
                }
                p = q;
            }
            q++;
        }
        if(!check_lianxu(arr, p, q)) {
            return false;
        }
        return true;

    }
    private static boolean check_lianxu(int[] arr, int p, int q) {
        return true;
    }
}
