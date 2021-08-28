import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LC_773_2 {
    public int slidingPuzzle(int[][] board) {
        int m = 2, n = 3;
        char[] ch = new char[6];
        String target = "123450";
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ch[k++] = (char) (board[i][j] + '0');
            }
        }
        String start = String.valueOf(ch);
        int[][] neighbor = {
                {1, 3},
                {0, 4, 2},
                {1, 5},
                {0, 4},
                {3, 1, 5},
                {4, 2}
        };
        ///////////////BFS框架开始/////////////////
        Queue<String> queue = new LinkedList<>();
        HashSet<String> visited = new HashSet<>();
        queue.offer(start);
        visited.add(start);
        int dep=0;
        while (!queue.isEmpty()){
            int sz = queue.size();
            for (int i=0;i<sz;i++){
                String cur = queue.poll();
                if (cur.equals(target))
                    return dep;
                int index = cur.indexOf('0');
                for (int j=0;j<neighbor[index].length;j++){
                    int p = neighbor[index][j];
                    String tmp = exchange(cur,p);
                    if (!visited.contains(tmp)){
                        visited.add(tmp);
                        queue.offer(tmp);
                    }
                }
            }
            dep++;
        }
        return -1;
    }
    public String exchange(String s,int i){
        String tmp = s.replace('0',s.charAt(i));
        char[] ch = tmp.toCharArray();
        ch[i] = '0';
        tmp = String.valueOf(ch);
        return tmp;
    }
}
