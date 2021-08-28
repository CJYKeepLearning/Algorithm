import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class LC_773 {
    //拼图游戏
    public int slidingPuzzle(int[][] board) {
        StringBuilder start = new StringBuilder();
        int k=0;
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                start.append(board[i][j]);
            }
        }
        String target = "123450";
       return bfs(start.toString(),target);
    }

    public int bfs(String start,String target){
        Queue<String> q = new LinkedList<>();
        HashSet<String> vis = new HashSet<>();
        int dep=0;
        q.offer(start);
        vis.add(start);
        int[] x = {-3,1,3,-1};
        while (!q.isEmpty()){
            int sz = q.size();
            for (int i=0;i<sz;i++){
                String cur = q.poll();
                int index0  = cur.indexOf('0');
                if (cur.equals(target))
                    return dep;
                for (int j=0;j<x.length;j++){
                    int tempIndex = index0+x[j];
                    if (tempIndex<0 || tempIndex>5)
                        continue;
                    String temp = cur;

                    char a = temp.charAt(tempIndex);
                    temp = temp.replace('0','6');
                    temp =  temp.replace(a,'0');
                    temp = temp.replace('6',a);

                    if (!vis.contains(temp)){
                        vis.add(temp);
                        q.offer(temp);
                    }
                }
            }
            dep++;
        }
        return -1;
    }
}
