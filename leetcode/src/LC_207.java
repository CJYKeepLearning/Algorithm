import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public class LC_207 {
    //判断有向图是否存在环

    List<Integer>[] buildGraph(int numCourses,int[][] prerequisities){
        List<Integer>[] graph = new LinkedList[numCourses];
        for (int i=0;i<numCourses;i++){
            graph[i] = new LinkedList<>();
        }
        for (int[] edge:prerequisities){
            int from = edge[1];
            int to = edge[0];
            graph[from].add(to);
        }
        return graph;
    }
}
