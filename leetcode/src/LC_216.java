import java.util.LinkedList;
import java.util.List;

public class LC_216 {
    LinkedList track = new LinkedList();
    List<List<Integer>> res = new LinkedList<>();
    int sum = 0;
    public List<List<Integer>> combinationSum3(int k, int n) {
        backtrack(k,n,1);
        return res;
    }

    private void backtrack(int k, int n, int start) {
        if(track.size() == k && sum == n){
            res.add(new LinkedList<>(track));
            return;
        }
        if (track.size()>k || sum > n)
            return;
        for (int i = start;i<=9;i++){
            sum += i;
            track.addLast(i);
            backtrack(k, n, i+1);
            track.removeLast();
            sum -= i;
        }
    }
}
