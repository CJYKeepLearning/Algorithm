import java.util.LinkedList;

public class ALGO_backtrackCombine {
    public static void main(String[] args) {
        int[] n = {1,2,3};
        solve(n);
        printRes(res);
    }
    public static LinkedList<LinkedList> res = new LinkedList<>();
    public static void solve(int[] n){
        LinkedList track = new LinkedList();
        backtrack(n,track);
    }
    public static void backtrack(int[] n,LinkedList track){
        if (track.size()==n.length){
            res.add(new LinkedList(track));
            return;
        }
        for (int i=0;i<n.length;i++){
            if (track.contains(n[i]))
                continue;
            track.add(n[i]);
            backtrack(n,track);
            track.removeLast();
        }
    }
    public static void printRes(LinkedList<LinkedList> res){
        for (LinkedList<Integer> list:res) {
            for (int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
