import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class LC_773Res {
    int[][] exchangeArray = new int[][]{
            {1, 3},
            {0, 2, 4},
            {1, 5},
            {0, 4},
            {1, 3, 5},
            {2, 4}
    };
    // 交换字符
    public String exchangeString(String string, int src, int dis) {
        char[] chars = string.toCharArray();
        char temp = chars[dis];
        chars[dis] = chars[src];
        chars[src] = temp;
        return new String(chars);
    }
    public int slidingPuzzle(int[][] board) {
        // 初始状态转字符串
        char[] chars = new char[6];
        int index = 0;
        for (int[] row:board) {
            for (int ch:row) {
                chars[index++] = (char)(ch+'0');
            }
        }
        String start = new String(chars);
        String target = "123450";
        // BFS套路
        Queue<String> q = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        q.offer(start);
        int step = 0;
        while (!q.isEmpty()) {
            int sz = q.size();
            for (int i = 0; i < sz; i++) {
                String cur = q.poll();
                // 解开谜板
                if (cur.equals(target)) {
                    return step;
                }
                int position = cur.indexOf('0');
                int[] exchanges = exchangeArray[position];
                for(int next:exchanges) {
                    String s = exchangeString(cur, position, next);
                    if (!visited.contains(s)) {
                        q.offer(s);
                        visited.add(s);
                    }
                }
            }
            step++;
        }
        return -1;
    }
}
