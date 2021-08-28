import javax.management.StandardEmitterMBean;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LC_773two {
    public String exchange(String cur,int index0,int another){
        char[] chars = cur.toCharArray();
        char temp = chars[another];
        chars[another] = chars[index0];
        chars[index0] = temp;
        return new String(chars);
    }
    public int slidingPuzzle(int[][] board) {
        int m=2,n=3;
        StringBuilder start = new StringBuilder();
        String target = "123450";
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                start.append(board[i][j]);
            }
        }
        int[][] neighbor = {
                {1,3},
                {0,4,2},
                {1,5},
                {0,4},
                {3,1,5},
                {4,2}
        };

        Queue<String> q = new LinkedList<>();
        HashSet<String> vis = new HashSet<>();
        q.offer(start.toString());
        vis.add(start.toString());
        int step=0;
        while (!q.isEmpty()){
            int sz = q.size();
            for (int i=0;i<sz;i++){
                String cur = q.poll();
                if (cur.equals(target)){
                    return step;
                }

                int idx = cur.indexOf('0');

                for (int k=0;k<neighbor[idx].length;k++){

                    String temp = exchange(cur,idx,neighbor[idx][k]);

                    if (!vis.contains(temp)){
                        vis.add(temp);
                        q.offer(temp);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
