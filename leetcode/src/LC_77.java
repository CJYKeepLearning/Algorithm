import java.util.LinkedList;
import java.util.List;

public class LC_77 {
    List<List<Integer>> res = new LinkedList<>();
    List<List<Integer>> combine(int n, int k){
        LinkedList track = new LinkedList();
        dfs(n,k,1,track);
        return res;
    }

    private void dfs(int n, int k, int i, LinkedList track) {
        if (track.size() == k){
            res.add(new LinkedList<>(track));
        }
        if (track.size() > k){
            return;
        }
        for (int j = i;j<=n;j++){
            track.add(j);
            dfs(n, k, j+1, track);
            track.removeLast();
        }
    }
}
